class Max{

	public static void main(String arg[])
	{
		int a = 2 , b = 5 , c = 8;

		if(a > b){
			if(a>c){
			System.out.println("A is Greator = "+a);
			}
			else	
			System.out.println("C is Greator = "+c);	
		}
		else if(b>a){
			if(b>c){
			System.out.println("B is Greator = "+b);
			}
			else
			System.out.println("C is Greator = "+c);
		}
		else
			System.out.println("C is Greator = "+c);
		
	}
}