package task2;
import java.util.Scanner;

public class account {
	
	String name;
	String adress;
	double ph_number;
	double uniq_number;
	double balance;
	double inp_uniqnum;
	
	Scanner myObj1 = new Scanner(System.in);
	
	void create_account()
	{
		System.out.println("Enter your Name: ");
		String name  = myObj1.nextLine();
		System.out.println("Enter your Adress: ");
		String adress  = myObj1.nextLine();
		System.out.println("Enter your Phone Number: ");
		double ph_number  = myObj1.nextDouble();
		System.out.println("Enter your Unique Account Number: ");
		double uniq_number  = myObj1.nextDouble();
		System.out.println("Enter your Balance: ");
		double balance  = myObj1.nextDouble();
		
		disp_acc(name,adress,ph_number,uniq_number,balance);
	}
	
	void disp_acc(String name, String adress, double ph_number, double uniq_number, double balance)
	{
		System.out.println("The Account Information is:");
		System.out.println("Name: " + name);
		System.out.println("Adress: " + adress);
		System.out.println("Phone Number: " + ph_number);
		System.out.println("Unique Number: " + uniq_number);
		System.out.println("Balance: " + balance);
	}
	
	int access(int x)
	{
		x = 1122;
		
		if (inp_uniqnum == x)
		{
			System.out.println("Access Granted !!!");
		}
		return x;
		
	}
	
	int deposit(int y)
	{
		return y+500;
	}
//
}
