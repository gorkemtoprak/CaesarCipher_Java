package OOCaesarCipher;

import edu.duke.*;

public class CaesarCipher {

	private String alphabet;
	private String Alphabet;
	private String shiftedAlphabet;
	private int mainKey;

	public CaesarCipher(int key) {

		alphabet = "abcdefghijklmnoprstuvwxyz";
		Alphabet = alphabet.toUpperCase();
		shiftedAlphabet = alphabet.substring(key) + alphabet.substring(0, key);

	}

	public String encrypt(String input) {

		StringBuilder encrypt = new StringBuilder(input);

		for (int i = 0; i < input.length(); i++) {
			char currChar = encrypt.charAt(i);
			int ind = alphabet.indexOf(Character.toUpperCase(currChar));
			if (ind != -1) {
				if (currChar == Character.toUpperCase(currChar)) {
					char shiftChar = shiftedAlphabet.charAt(ind);
					encrypt.setCharAt(i, shiftChar);
				} else {
					char shiftCar = shiftedAlphabet.charAt(ind);
					encrypt.setCharAt(i, Character.toLowerCase(shiftCar));
				}
			}
		}
		return encrypt.toString();
	}

	public String decrypt(String input) {
		CaesarCipher cc = new CaesarCipher(26 - mainKey);
		return cc.encrypt(input);
	}

}
