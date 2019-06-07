package com.infoway.domain;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		sb.append("Hello");
		System.out.println(sb+" "+sb.capacity());
         sb.append("World").append("Hi").append("AAAAAA");
         System.out.println(sb+" "+sb.capacity()+" "+sb.length());
      //   sb.setCharAt(1, 'Z');
       //  System.out.println(sb);
           sb.insert(5, "_java");
           System.out.println(sb);
           sb.insert(10,' ');
           System.out.println(sb);
           sb.delete(5, 10);
           System.out.println(sb);
           System.out.println(sb.reverse());
           String s= sb.toString();
           System.out.println(s);
           StringBuilder sb1=new StringBuilder();
   		   sb1.append("Hello");
   		   System.out.println(sb1+" "+sb1.capacity());
            sb1.append("World").append("Hi").append("AAAAAA");

           
           
           
           
           
           
           
           
	}

}
