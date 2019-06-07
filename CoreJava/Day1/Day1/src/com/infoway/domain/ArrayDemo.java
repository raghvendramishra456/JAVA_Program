package com.infoway.domain;

public class ArrayDemo {
     static int countOdd(int ar[]) {
    	 int count=0;
    	 for(int x:ar) {
    		 if(!(x%2==0)) {
    			count++; 
    		
    		 }
    	 }
       return count;
     }
	public static void main(String[] args) {
		/*
		 * int arr[]= {11,21,30,67}; for(int i=0;i<arr.length;i++) {
		 * System.out.println(arr[i]); } System.out.println(countOdd(arr));
		 * 
		 */  int arr2D[][]=new int[2][3];
      int ctr=0;
      for(int i=0;i<arr2D.length;i++) {
    	  for(int j=0;j<arr2D[i].length;j++) {
    		  
    		  arr2D[i][j]=++ctr;
    		  System.out.print(arr2D[i][j]+" ");
    	  }
    	  System.out.println();
      }
      
	}

}
