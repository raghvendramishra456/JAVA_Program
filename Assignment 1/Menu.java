import java.util.*;

class Menu{

	public static void main(String ar[]){

		Scanner in = new Scanner(System.in);	
		
		System.out.println("\n1. Add \n2.Sub \n3. Mul \n4. Div");
		
		System.out.println("\nEnter Your Choice = ");
		int choice = in.nextInt();

		switch(choice){

		case 1:
			System.out.println("Enter 1st Number = ");
			int a = in.nextInt();
			
			System.out.println("Enter 2nd Number = ");
			int b = in.nextInt();
		
			int x = a + b;
			
			System.out.println("Sum of Number = "+x);
			break;
		case 2:
			System.out.println("Enter 1st Number = ");
			int a1 = in.nextInt();
			
			System.out.println("Enter 2nd Number = ");
			int b1 = in.nextInt();
		
			int x1 = a1 - b1;
			
			System.out.println("Sub of Number = "+x1);
			break;		
		case 3:
			System.out.println("Enter 1st Number = ");
			int a2 = in.nextInt();
			
			System.out.println("Enter 2nd Number = ");
			int b2 = in.nextInt();
		
			int x2 = a2 * b2;
			
			System.out.println("Mul of Number = "+x2);
			break;

		case 4:
			System.out.println("Enter 1st Number = ");
			int a3 = in.nextInt();
			
			System.out.println("Enter 2nd Number = ");
			int b3 = in.nextInt();
		
			int x3 = a3 / b3;
			
			System.out.println("Div of Number = "+x3);
			break;

		default:
			System.out.println("Invalid Choice");	
		}
		
		
	}
}