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

	public static void permute(String beginningNumber, String endingNumber) {

		if (endingNumber.length() <= 1) {
			System.out.println(beginningNumber + endingNumber);
		} else {
			for (int i = 0; i < endingNumber.length(); i++) {
				try {
					String newString = endingNumber.substring(0, i)
							+ endingNumber.substring(i + 1);

					permute(beginningNumber + endingNumber.charAt(i), newString);

				} catch (Exception e) {
					e.printStackTrace();
				}

			}

		}
	}

}
