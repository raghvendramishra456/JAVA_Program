import java.util.*;

class Table{

	public static void main(String ar[]){
	
	int i = 1;
	int t = 0;

	Scanner in = new Scanner(System.in);
	
	System.out.printf("Enter Number for Table = ");
	int a = in.nextInt();

	
	while(i<11){
			t = i * a;
			System.out.println(a+" * "+i+" = "+t);
		
			i++; 
		}
	}
}