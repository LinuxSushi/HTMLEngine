package HTMLEngine.nodes;

import HTMLEngine.utils.Utils;

public class Text extends Node {
	public String text;

	public Text(String text) {
		this.text = text;
	}
	
	public String render() {
		return Utils.escapeHTML(this.text);
	}
}
