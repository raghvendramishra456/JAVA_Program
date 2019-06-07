package com.infoway.domain;

import java.util.Scanner;
enum DAYS{ MONDAY,TUESDAY,WEDNESDAY};
public class EnumDemo {

	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
		 System.out.println("Enter day");
		 String day =sc.next();
		
		 DAYS days=DAYS.valueOf(day.toUpperCase());
		 
		 switch (days) {
		case MONDAY:
			   System.out.println("Monday");
			break;
		case TUESDAY:
			   System.out.println("Tuesday");
			break;
		case WEDNESDAY:
			   System.out.println("Wednesday");
			break;

		default:
			break;
		}
		
	}

}
