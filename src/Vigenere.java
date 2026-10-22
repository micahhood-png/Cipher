import java.util.Scanner;

public class Vigenere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Read in message
		Scanner in = new Scanner(System.in);
		String message = in.nextLine();
		String shift = in.nextLine(); 
		String output = "";
		int pos = 0;
		for (int x = 0; x < message.length(); x++) {
			char letter = message.charAt(x);
			if (Character.isAlphabetic(letter)) {
			char shifty = (char) (shift.charAt(pos)-'a'); 

			

				letter += shifty;

			
				if (letter > 'z') {
					letter -= 26;
				}
				// add to output
				// update pos
				pos++;
				pos %= shift.length();
				
			}
			output += letter;
		}

		System.out.println(output);
		in.close();
	}

}
