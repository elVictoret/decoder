import java.util.Scanner;

public class rot13 {

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
