import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Decoder {
	
	static Utils utils = new Utils();
	
	public static void test(String[] args) {
		System.out.println("ee");
	}
	
	public static void base64() {
		Scanner sc = new Scanner(System.in);
		Utils utils = new Utils();
		System.out.println("");
		System.out.print("Introduce ciphertext: ");
		String ciphertext = sc.nextLine();
		char[] ciphertextarray = ciphertext.toCharArray();
		for ( int i=0; i < ciphertextarray.length; i++) {
			System.out.println(ciphertextarray[i]);
			System.out.println(utils.decimalToBinary((int) ciphertextarray[i],8));
		}
	
	}
	
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
			else if (littleString.indexOf('x') != -1) {
				solution += ((char) (Integer.parseInt(littleString.replace('x','0'),2) + 65));
			}
			else {
				solution += ((char) (Integer.parseInt(littleString.replace('x','0'),2) + 65));
			}
		}
		
		System.out.println(solution);
		
	}
	
	public static void rot13() {
		Scanner sc = new Scanner(System.in);
		boolean alert = false;
		System.out.println("");
		System.out.print("Introduce ciphertext: ");
		String ciphertext = sc.nextLine();
		String decipher = "";
		char[] ciphertextarray = ciphertext.toCharArray();
		for ( int i=0; i < ciphertextarray.length; i++) {
			if (((int) ciphertextarray[i] >= 97 && (int) ciphertextarray[i] < 110) || ((int) ciphertextarray[i] >= 65 && (int) ciphertextarray[i] < 78) ) {
				decipher+=(char) ((int) ciphertextarray[i] + 13);
			}
			else if (((int) ciphertextarray[i] >= 110 && (int) ciphertextarray[i] < 123) || ((int) ciphertextarray[i] >= 78 && (int) ciphertextarray[i] < 91) ) {
				decipher+=(char) ((int) ciphertextarray[i] - 13);
			}
			else if ((int) ciphertextarray[i] == 32) {
				decipher+=ciphertextarray[i];
			}
			else {
				decipher+=ciphertextarray[i];
				alert=true;
			}
		}
		System.out.println("Text decoded: " + decipher) ;
		System.out.println("");
		if (alert == true) {
			System.out.println("WARNING: Some of the charecters hadn't been converted");
		}
	}
	
}
