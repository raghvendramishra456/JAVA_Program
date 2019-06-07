
public class Student {
	private int rollno;
	private String name;
	private int marks;
	static int count;

	public Student() {
		count++;
		/*
		 * rollno=1; name="Anita"; marks=50;
		 */ }

	public Student(int rollno, String name, int marks) {
		count++;
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	
	   public int getRollno(){
		   return rollno;
	   }
	   
	   public int getMarks() {
		   return marks;
	   }
	   public void setName(String name){
		   this.name=name;
	   }

	/*
	 * public int getRollno() { return rollno; }
	 * 
	 * public void setRollno(int rollno) { this.rollno = rollno; }
	 * 
	 * public String getName() { return name; }
	 * 
	 * public void setName(String name) { this.name = name; }
	 * 
	 * public int getMarks() { return marks; }
	 * 
	 * public void setMarks(int marks) { this.marks = marks; }
	 */
	static void showCount() {

		System.out.println("Count :" + count);

	}

	void display() {

		System.out.println("Roll no : " + rollno);
		System.out.println("Name : " + name);
		System.out.println("Marks : " + marks);
	}

}
