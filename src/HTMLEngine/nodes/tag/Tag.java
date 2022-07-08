package HTMLEngine.nodes.tag;

import java.util.ArrayList;

import HTMLEngine.exceptions.*;
import HTMLEngine.nodes.Node;
import HTMLEngine.utils.Constants;
import HTMLEngine.utils.Utils;

public class Tag extends Node {
	public ArrayList<Node> children = new ArrayList<Node>();

	public Tag(String tagName) throws BaseException {
		super();
		if (Utils.containtsInvalidChar(tagName))
			throw new InvalidCharacterException();
		this.tagName = tagName;
	}

	public ArrayList<Attribute> attribs = new ArrayList<Attribute>();
	public String tagName;

	public Node addChild(Node child) {
		children.add(child);
		return child;
	}

	public String renderChildren() {
		String out = "";
		for (Node child : this.children) {
			out += child.render();
		}
		return out;
	}

	public String render() {
		StringBuilder out = new StringBuilder();
		out.append(Constants.openHTMLTagDeclaration);
		out.append(this.tagName);
		// <a
		for (Attribute attrib : this.attribs) {
			out.append(' ');
			out.append(attrib.key);
			out.append(Constants.attribEquals);
			out.append(Constants.attribQuotes);
			out.append(attrib.value);
			out.append(Constants.attribQuotes);
		}
		// <a class="link"
		out.append(Constants.closeHTMLTagDeclaration);
		// <a class="link">

		out.append(this.renderChildren());
		// <a class="link">etc.

		out.append(Constants.openHTMLTagDeclaration);
		out.append(Constants.closeHTMLElement);
		out.append(this.tagName);
		out.append(Constants.closeHTMLTagDeclaration);
		// <a class="link">etc.</a>

		return out.toString();
	}

}
