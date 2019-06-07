import java.util.Scanner;


enum Season{SPRING,SUMMER,FALL,WINTER};
public class EnumDemo {

		public static void main(String[] args) {

			 Scanner sc= new Scanner(System.in); 
			 System.out.println("Enter Season");
			 String sname= sc.next();
			Season myseason=null;
			myseason=Season.valueOf(sname.toUpperCase());
			
	  switch(myseason)
	  {
	  case SUMMER:
		          System.out.println("It is hot season");
		        break;
		        
	  case SPRING:
		  System.out.println("It is peasant season");
		        break;
	  case FALL:
		  System.out.println("It is fall season");
		       break;
	  case WINTER:
		  System.out.println("It is cold season");
		       break;
	  }
			
		}

}
