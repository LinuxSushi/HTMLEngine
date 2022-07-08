package HTMLEngine.nodes;

import HTMLEngine.nodes.tag.Tag;

public class Document {
	public Tag html;
	public Tag head;
	public Tag body;

	public Document(boolean createBoilerplate) throws Exception {
		html = new Tag("html");
		if (createBoilerplate) {
			head = (Tag) addChild(new Tag("head"));
			body = (Tag) addChild(new Tag("body"));
		}
	}
	
	public Node addChild(Node node) {
		return html.addChild(node);
	}
	
	public String render() {
		return "<!DOCTYPE html>" + html.render();
	}

}
