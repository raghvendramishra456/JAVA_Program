
public class WrapperDemo {

	public static void main(String[] args) {
         int x=5;
         Integer I1=x;//autoboxing
         System.out.println(x+" "+I1);
         //Integer I2= Integer.valueOf(x);//boxing
         Integer I2= new Integer(x);//boxing
         System.out.println(I2);
         
         Integer I3= new Integer(10);
       //  int y=I3;//autounboxing
         int y=      I3.intValue();//unboxing
         System.out.println(I3+" "+y);
         
         String number1="12";
         String number2="16";
         
         int a=Integer.parseInt(number1);
         int b=Integer.parseInt(number2);
         System.out.println(a+b);
         
         
	}

}
