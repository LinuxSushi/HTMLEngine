package HTMLEngine.tests;

import HTMLEngine.nodes.Document;
import HTMLEngine.nodes.Text;
import HTMLEngine.nodes.tag.Attribute;
import HTMLEngine.nodes.tag.Tag;

public class Test {

	public static void main(String[] args) throws Exception {
		Document document = new Document(true);
		
	
		Tag title = (Tag) document.head.addChild(new Tag("title"));
		title.addChild(new Text("This is a test"));

		
		Tag text = (Tag) document.body.addChild(new Tag("h1"));
		text.addChild(new Text("Foo bar baz <&>"));
		
		text.attribs.add(new Attribute("class", "cool"));
		text.attribs.add(new Attribute("style", "color:red"));
			
		System.out.println(document.render());
	}

}
