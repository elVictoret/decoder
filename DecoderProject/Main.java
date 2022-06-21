import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Main {
	public static void main(String[] args) {
		
		Utils utils = new Utils();
		gui gui = new gui();
		//gui.environment();
		
		boolean exit = false;
		
		do {
		Scanner sc = new Scanner(System.in);
		System.out.println("CURRENT OPTIONS AVALIBLE");
		System.out.println("1. base64");
		System.out.println("2. base32");
		System.out.println("3. rot13");
		System.out.println("4. Caesar cipher");
		System.out.println("0. EXIT");
		System.out.print("Choose a encode type: ");
		try {
			int selection = Integer.parseInt(sc.nextLine());
			switch(selection) {
			case 0:
				exit = true;
				System.out.println("Bye!");
				break;
			case 1:
				b64.base64();
				again();
				break;
			case 2:
				b32.base32();
				again();
				break;
			case 3:
				rot13.rot13();
				again();
				break;
			
			default:
				System.out.println("Incorrect selection");
				} 	
			}
			catch (Exception e) {
				System.out.println("ERROR: Selection must be a number");
				System.out.println("");
				main(args);
			}
			
		} while (exit = false);
	}

	
	public static void again() {
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		System.out.print("Try again? Y/n: ");
		System.out.print("");
		String selection = sc.nextLine();
		switch(selection) {
			case "Y":
			case "y":
				main(null);
				break;
			case "N":
			case "n":
				System.out.println("Bye!");
				break;
			default:
				System.out.println("Type Y/y for Yes and N/n for No");
				again();
				break;
		}
	}
}