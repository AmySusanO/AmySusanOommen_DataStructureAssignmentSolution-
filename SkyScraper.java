package gl.scyscraper.assgn;

import java.util.Scanner;

public class SkyScraper {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of floors");
		int size = sc.nextInt(); 
		int arr[] = new int[size]; 
		  int temp = 0;  
		System.out.println("Enter the size of floor on each day ") ;
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Day"+" "+i+":");
			arr[i] = sc.nextInt(); //0 -rs 100 pass this to some other iteration data store
								
		}
		
		
		
		
		System.out.println("The order of construction is as follows");
		
		for(int i=0;i<size;i++)
		{
			 for (int j = i+1; j < arr.length; j++) {   
	               if(arr[i] < arr[j]) {  
	                   temp = arr[i];  
	                   arr[i] = arr[j];  
	                   arr[j] = temp;  
	               }   
	               
	            }   
			
			
			
			 System.out.println("Day"+" "+i+":"+arr[i]);
		}
		
		
		
		
		
		
		
		
	}

}
