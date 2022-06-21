import java.util.Scanner;

public class b32 {

	public static void base32() {
		Scanner sc = new Scanner(System.in);
		Utils utils = new Utils();
		String hugeString = "";
		String[] littleStrings = new String[40];
		System.out.println("");
		System.out.print("Introduce ciphertext: ");
		String ciphertext = sc.nextLine();
		char[] ciphertextarray = ciphertext.toCharArray();
		for ( int i=0; i < ciphertextarray.length; i++) {
			hugeString += utils.decimalToBinary((int) ciphertextarray[i],8);
		}
		while (hugeString.length()%40 != 0) {
			hugeString += "x"; 
		}
		littleStrings = utils.chunks(hugeString,5);
		
		String solution = "";

		for (String littleString : littleStrings ) {
			if (littleString.equals("xxxxx")) {
				solution += '=';
			}
			else {
				solution += ((char) (Integer.parseInt(littleString.replace('x','0'),2) + 65));
			}
		}
		
		System.out.println(solution);
		
	}

	//From base32 to plaintext
	public static void base32r(String base32) {
		String binarystring = "";
		Utils utils = new Utils();
		char[] characters = base32.toCharArray();
		for (char character : characters) {
			int num = (int) character - 65;
			if ( num != -4) {
				String bin = utils.decimalToBinary(num, 5);
				binarystring += bin;
			}
		}
		String solution = "";
		String[] chunks = utils.chunks(binarystring,8);
		for (String chunk : chunks) {
			solution += ((char) Integer.parseInt(chunk,2));
			}
		
		System.out.println(solution);
	}
	
}
