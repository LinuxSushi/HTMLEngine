package HTMLEngine.nodes.tag;

import HTMLEngine.exceptions.*;
import HTMLEngine.utils.Utils;

public class Attribute {
	public String key, value;

	public Attribute(String key, String value) throws BaseException {
		if (Utils.containtsInvalidChar(key)) throw new InvalidCharacterException();
		this.key = key;
		this.value = Utils.escapeHTML(value);
	}
}
