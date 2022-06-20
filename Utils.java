import java.util.ArrayList;
import java.util.List;

public class Utils {

	public String decimalToBinary(int decimal, int numBits) {
		
		String solution = "";
		
		int a = decimal;
		
		while (a > 1) {
			solution = Integer.toString(a % 2) + solution;
			a = a/2;
		}
		
		solution = Integer.toString(a) + solution;

		while (solution.length() < numBits) {
			solution = "0" + solution;
		}

		return solution;
	}
	
	public int binaryToDecimal(int binary) {
		int maxexp = Integer.toString(binary).length() - 1;
		int[] exp = new int[maxexp + 1];
		int[] base = new int[maxexp + 1];
		int indexbase = 0;
		int sol = 0;
		for (int i = maxexp; i >= 0; i--) {
			exp[i] = maxexp - i;
		}
		while (binary > 0) {
		    base[maxexp-indexbase] = binary % 10;
		    binary = binary / 10;
		    indexbase++;
		}
		for (int i = 0; i < exp.length; i++) {
			sol += (2^exp[i])*base[i];
			}
		System.out.println(exp.toString());
		return sol;
		}
	
	public String[] chunks(String input, int chunkLength) {
		String[] solution = new String[input.length()/chunkLength];
		String chunk = "";
		int indexarray = 0;
		for (int i = 0; i < input.length(); i++) {
			chunk += input.toCharArray()[i];
			if (chunk.length() == chunkLength) {
				solution[indexarray] = chunk;
				chunk = "";
				indexarray+=1;
			}
		}
		return solution;
	}
	
}
