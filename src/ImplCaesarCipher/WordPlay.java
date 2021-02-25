package ImplCaesarCipher;

public class WordPlay {

	public static void main(String[] args) {
		
		Boolean ch = isVowel('F');
        System.out.println(ch);
        
        String a = replaceVowels("Hello World", '*');
        System.out.println(a);
        
        String a1 = emphasize("Hello mada fakaaas", 'a');
        System.out.println(a1);

	}

	public static boolean isVowel(char ch) {

		boolean a = false;
		String s = "aeiouAEIOU";

		for (int i = 0; i < s.length(); i++) {
			char curr = s.charAt(i);
			if (curr == ch) {
				a = true;
			}
		}
		return a;
	}

	public static String replaceVowels(String phrase, char ch) {

		StringBuilder builder = new StringBuilder(phrase);

		for (int i = 0; i < phrase.length(); i++) {
			char curr = builder.charAt(i);
			if (isVowel(curr)) {
				builder.setCharAt(i, ch);
			}
		}

		return builder.toString();
	}

	public static String emphasize(String phrase, char ch) {

		StringBuilder build = new StringBuilder(phrase);

		for (int i = 0; i < phrase.length(); i++) {
			char curr = build.charAt(i);
			if ((i % 2 == 0) && (curr == Character.toLowerCase(ch) || curr == Character.toUpperCase(ch))) {
				build.setCharAt(i, '*');
			} 
			else {
				if (curr == Character.toLowerCase(ch) || curr == Character.toUpperCase(ch)) {
					build.setCharAt(i, '+');
				}
			}

		}
		return build.toString();
	}
}
