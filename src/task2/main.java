package task2;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		
		int choice;
		
		do
		{
		System.out.println("----Welcome to the Account Management System----");
		System.out.println("Press 1 to create an Account");
		System.out.println("Press 2 to Login to your account");
		System.out.println("Press 3 to Perform Account operations");
		System.out.println("Press 4 to specify Interest Rates");
		System.out.println("Press 5 to display account details");
		System.out.println("Press 6 to Quit");
		
		choice = myObj.nextInt();
		account obj = new account();
		
		if (choice == 1)
		{
			obj.create_account();
		}
		}while (choice != 6);
		
	}

}
	
	
