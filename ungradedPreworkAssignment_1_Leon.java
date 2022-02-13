import java.util.Scanner;


public class ungradedPreworkAssignment_1_Leon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main obj=new Main();
		int choice;
		Scanner sc=new Scanner(System.in);
		
		
		do {
			
			System.out.print("\n");
			
			System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

		+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

		+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

		System.out.println();
		
		choice = sc.nextInt();

		switch (choice) {

		 

		case 0:

		choice = 0;

		break;

		 

		case 1: {

		obj.check_Palindrome();

		}

		break;

		 

		case 2: {

		 

		obj.print_Pattern();

		}

		break;

		 

		case 3: {

		obj.check_Prime();

		}

		break;

		 

		case 4: {

		 

		obj.print_Fibonacci();

		}

		break;

		 

		default:

		System.out.println("Invalid choice. Enter a valid no.\n");

		}
			
			
		}while(choice!=0);
		
		System.out.println("Exited Successfully!!!");

		sc.close();
			

	}

}
