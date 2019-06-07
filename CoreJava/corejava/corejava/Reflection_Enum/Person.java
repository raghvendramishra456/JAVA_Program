
public class Person {
	
	private String firstName;
	private String lastName;
	private  GENDER gender ;
	private int age;
	private float weight;
    private String mobileno;
	
	
	public Person() {
		super();
	}

	public Person(String firstName, String lastName, GENDER gender, int age, float weight) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		this.weight = weight;
	}

	
	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public GENDER getGender() {
		return gender;
	}

	public void setGender(GENDER gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	void display(){
		
		System.out.println(" First Name "+firstName);
		System.out.println( "Last Name "+lastName);
		System.out.println( "Gender "+gender);
		System.out.println( "Weight "+weight);
		System.out.println( "Mobile no "+mobileno);
		 
		
	}
}
 