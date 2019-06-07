import java.util.Scanner;

 enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY 
}

public class EnumEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter day");
	String m_day=sc.next();
		
		Day day= Day.valueOf(m_day.toUpperCase());
		//System.out.println(day);
		switch(day)
		{
		case MONDAY:
			         System.out.println("Start of the Week");
		              break;
		case TUESDAY:
			         System.out.println("Second day of week");
		             break;
		case WEDNESDAY:
			System.out.println("Third day of week");
            break;
			
		}
		
		
		
	
	}

}
