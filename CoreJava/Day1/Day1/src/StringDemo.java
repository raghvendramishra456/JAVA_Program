import java.util.StringTokenizer;

public class StringDemo {

	public static void main(String[] args) {
         String s1="abc";
         String s2="abc";
         if(s1.equals(s2)) {
        	 
        	 System.out.println("both are equal");
         }else {
        	 System.out.println("both are not equal");
         }
		  if(s1==s2) {
			  System.out.println("both refer to same object");
		  }else {
			  System.out.println("both do not refer to same object");
		  }
		
		  
		  String s3=new String("abc");
		  String s4=new String("abc");
	         if(s3.equals(s4)) {
	        	 
	        	 System.out.println("both are equal");
	         }else {
	        	 System.out.println("both are not equal");
	         }
			  if(s3==s4) {
				  System.out.println("both refer to same object");
			  }else {
				  System.out.println("both do not refer to same object");
			  }
			
		  
		/*
		 * String s1="HelloWorld"; String s3="HeLloWorLd"; String s2= new
		 * String("HelloWorld"); char ch1=s1.charAt(0); System.out.println(ch1);
		 * System.out.println(s1.compareTo(s3));
		 * System.out.println(s1.equalsIgnoreCase(s3)); String s4="HelloWorld"; String
		 * s5="HelloWorldHello"; System.out.println(s4.equals(s5));
		 * System.out.println(s4.indexOf('u')); System.out.println(s4.lastIndexOf('l'));
		 * System.out.println(s4.length()); s4=s4.concat("Hi"); System.out.println(s4);
		 * s4=s4.replace('l', 'L'); System.out.println(s4); String
		 * s6=s5.substring(5,10); System.out.println(s6); String s7=" abc  ";
		 * System.out.println("---"+s7.trim()+"----");
		 * 
		 * 
		 * String s8=" 1 ,Anita,2000;2,Sunita,3000";
		 * 
		 * StringTokenizer sz= new StringTokenizer(s8,";");
		 * System.out.println(sz.countTokens());
		 * 
		 * while(sz.hasMoreTokens()) {
		 * 
		 * String token=sz.nextToken(); StringTokenizer sz1= new
		 * StringTokenizer(token,", "); while(sz1.hasMoreTokens()) {
		 * System.out.println(sz1.nextToken()); } // System.out.println(token); }
		 * 
		 * String sArr[]=s8.split(" "); for(String x:sArr) { System.out.println(x); }
		 * 
		 * 
		 */

	}

}
