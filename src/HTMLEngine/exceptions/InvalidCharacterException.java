package HTMLEngine.exceptions;

@SuppressWarnings("serial")
public class InvalidCharacterException extends BaseException {
	public InvalidCharacterException() {
		super("Attribute contains an invalid character");
	}
}
