

import java.util.Scanner;

public class Caesar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		String message = in.nextLine();
		int shift = in.nextLine().charAt(0) - 'a';
		String output = "";
		for (int x = 0; x < message.length(); x++) {
			char letter = message.charAt(x);
			if (Character.isAlphabetic(letter)) {
				letter += shift;
				if (letter > 'z') {
					letter -= 26;
				}
			}
			output += letter;
		}
		System.out.println(output);
	}

}
