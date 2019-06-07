
public class EnumDemo1 {

	enum Sweets{ KAJUKATLI(700),GULABJAM,RASMALI(450),PEDHA; 
	 private int price;	
	private Sweets(int price){
		System.out.println("in ctr "+price);
		this.price=price;
	}
	private Sweets(){
		
		price=100;
	}
	public void display(){
		System.out.println(" Price "+price);
	}
	}
	
	public static void main(String[] args) {
		Sweets sweets=Sweets.GULABJAM;
         sweets.display();
         Sweets sweets1=Sweets.KAJUKATLI;
          sweets1.display();
	}

}
