import com.infoway.domain.Top;
public class StudentApplication {
	/*
	 * public void showMenu() { System.out.println("1. Create Student");
	 * System.out.println("2. Show Student"); }
	 */
	
	public static void showMrks(Student s) {
		
		System.out.print(s.getRollno()+"  ");
		System.out.println(s.getMarks());
	}
	public static void main(String[] args) {
		Student student1 = new Student(11, "Sunita", 34);
		
	     student1.setName("Sunitha");
	     System.out.println("After update");
	      showMrks(student1);
	     Student.showCount();
		Student student2 = new Student(12, "Vanita", 44);
		  showMrks(student2);
		Student.showCount();
		  
	}

}
