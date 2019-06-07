import java.util.*;

class VowalConsonet{

		public static void main(String ar[]){

		Scanner in = new Scanner(System.in);

		System.out.print("Enter Charactor = ");
		char ch = in.nextChar();
		
		
		if(ch.length() > 1){		

			if( ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122){
		
				System.out.println("This is Charator Lattor");


	else if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'E'){

					System.out.println("This is Vowal = "+ch);
				}
			}
			else if(ch ){
					System.out.println("This is Consonent Charator = "+ch);	
			
				}
				else{
				System.out.println("This is Other Charator = "+ch);	
				}
		
			}		
	}
	
}