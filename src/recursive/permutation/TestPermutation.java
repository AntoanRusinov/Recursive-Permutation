package recursive.permutation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author antoan
 * 
 */
public class TestPermutation {

	public static void main(String[] args) throws IOException {

		String input;
		System.out.println("Enter string to calculate all permutations:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		input = br.readLine();
		System.out.println("Permutations are: ");
		permute("", input);

	}

	public static void permute(String beginningChar, String endingChar {

		if (endingChar.length() <= 1) {
			System.out.println(beginningChar + endingChar);
		} else {
			for (int i = 0; i < endingChar.length(); i++) {
				try {
					String newString = endingChar.substring(0, i)
							+ endingChar.substring(i + 1);

					permute(beginningChar + endingChar.charAt(i), newString);

				} catch (Exception e) {
					e.printStackTrace();
				}

			}

		}
	}

}
