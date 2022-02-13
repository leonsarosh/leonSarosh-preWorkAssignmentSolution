import java.util.Scanner;

public class Main {

	//function to checkPalindrome
	public void check_Palindrome() {
		
        Scanner sc=new Scanner(System.in);
		
		int num,sum,temp,r;
		
		System.out.println("Enter a number to check for Plaindrome");
		
		num=sc.nextInt();
		
		temp=num;
		sum=0;
		
		while(num>0) {
		
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
			
		}

		if(temp==sum) {
			System.out.println("Number is a Palindrome");
		}
		
		else {
			System.out.println("Number is not a Palindrome");
	}
		System.out.print("\n");
		
	}

	//function to printPatter
		public void print_Pattern() {
			
			int n;
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter number of stars in first line");
			n=sc.nextInt();
			
			if (n>0) {
				
				for (int count=n;count>0;count--) {
					
					for (int i=count;i>0;i--) {
						
						System.out.print("*");
					}
					
					System.out.print("\n");
				}
			}
			else {
				System.out.println("Please enter non zero value");
			}
			
			System.out.println("Pattern Complete");
			
			System.out.print("\n");
			
		}

	//function to checkPrime
		public void check_Prime() {
			
			Scanner sc=new Scanner(System.in);
			
			System.out.print("Enter a number to check if it is Prime or Composite : ");
			int num=sc.nextInt();
			
			int remcount=0,rem2count=0;
		
			if(num>1) {
				
				System.out.print("The number is divisible by 1");
				
				for (int count=2;count<num;count++) {
					
					
					int rem=num%count;
					
					if(rem==0) {
						
						remcount=++remcount;
						
						System.out.print(" , "+ count);
			
				}
				}
				
				if(remcount==0){
					
					System.out.println(" and " + num +" only. Therefore it is a Prime.");
				}
				else {
					
					System.out.println(" and " + num +". Therefore it is a Composite.");
				}
				
				
			}
			
			
			else if(num==1) {
				
				System.out.println("1 is neither Prime nor Composite.");
			}
			
			else {
				System.out.println("Please enter number greater than 1 ");
			}
			
			System.out.print("\n");
					
				}
	
	//function to printFibonacci
		public void print_Fibonacci() {
			
			Scanner sc= new Scanner(System.in);
			
			System.out.print("Enter a number of terms needed for the Fibonacci series : ");
			int num=sc.nextInt();
			
			int term1=0,term2=1;
			
			System.out.print("Terms of the Fibonacci series are "+ term1 + " , "+ term2);
			
			for(int count=num-2;count>0;count--) {
				
			int nextterm= term1 + term2;
			
			System.out.print(" , " + nextterm);
			
			term1=term2;
			term2=nextterm;
				
			}
			
			System.out.print(".");
			
			System.out.print("\n");

					
				}	
}
