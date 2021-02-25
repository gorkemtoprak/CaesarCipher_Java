package BreakingCaesCiph;

import edu.duke.*;

public class WordLengths {

	public static void main(String[] args) {

		FileResource resource = new FileResource();
		int [] counts = new int[31];
		countWordLenght(resource, counts);
		indexOfMax(counts);
	}

	public static void countWordLenght(FileResource resource, int[] counts) {

		for (String word : resource.words()) {
			int wLength = word.length();
			for (int i = 0; i < word.length(); i++) {
				char currChar = word.charAt(i);
				if ((i == 0) || (i == word.length() - 1)) {
					if (!Character.isLetter(currChar))
						wLength--;
				}
			}
			counts[wLength]++;
			System.out.println(" Words of length " + wLength + " " + word);

		}
	}

	public static void indexOfMax(int[] values) {

		int max = 0;
		int position = 0;
		for (int i = 0; i < values.length; i++) {
			if (values[i] > max) {
				max = values[i];
				position = i;
			}
		}

		System.out.println("The most common word is :" + position);

	}

}
