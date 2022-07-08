package HTMLEngine.utils;
public class Utils {
	public static boolean isInvalidChar(char c) {
		return c > 127 || c == '"' || c=='\''|| c == '<' || c == '>' || c == '&';
	}
	
	public static boolean containtsInvalidChar(String s) {
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (isInvalidChar(c)) {
				return true;
			}
        }
		return false;
	}
	
	public static String escapeHTML(String s) {
	    StringBuilder out = new StringBuilder();
	    for (int i = 0; i < s.length(); i++) {
	        char c = s.charAt(i);
	        if (isInvalidChar(c)) {
	            out.append("&#");
	            out.append((int) c);
	            out.append(';');
	        } else {
	            out.append(c);
	        }
	    }
	    return out.toString();
	}
}
