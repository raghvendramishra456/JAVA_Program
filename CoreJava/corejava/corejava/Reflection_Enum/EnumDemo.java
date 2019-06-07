import java.util.Scanner;



public class EnumDemo {
    
	enum Day {MON,TUE,WED,THU,FRI,SAT,SUN}//declaration	

	public static void main(String[] args) {
             Scanner sc= new Scanner(System.in);
       
       System.out.println("Enter day");     
         String m_day=sc.nextLine();     
		
         Day day=Day.valueOf(m_day);
		         
		  Day[] arr= day.values();
		   for(Day d:arr)
		   System.out.println(d+"  "+d.ordinal());
		   
		  
		
		
        switch(day){
        case MON:
        	           System.out.println("Monday First day of the week");
                        break;
        case TUE:               
        	           System.out.println(" Tuesday Second day of the week");
                       break;
        case WED:               
	                   System.out.println("Wednesday Third day of the week");
                       break; 
        case THU:               
	                    System.out.println("Thurday Forth day of the week");
                        break;
        case FRI:               
	                    System.out.println("Fith day of the week");
                        break;
        case SAT:               
	                    System.out.println("Sixth day of the week");
                        break;
        case SUN:               
	                     System.out.println("Seventh day of the week");
                        
                       
        } 
        
       
		System.out.println("end");
	}

}
