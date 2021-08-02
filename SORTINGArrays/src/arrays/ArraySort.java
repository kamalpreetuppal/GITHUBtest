package arrays;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		
		int array1[]={7,5,3,2,9};
		for(int i=0;i<=array1.length-1;i++);
			
			String[]array2= {
					"Kamalpreet","Sarbjeet","Manvir",
					"Harminder","Ravinder"
			};
			System.out.println("my insorted numeric array1 is "+Arrays.toString(array1));
			//sort the array1
			Arrays.sort(array1);
			System.out.println("my sorted numeric array1 is "+Arrays.toString(array1));
	
			
			System.out.println("my insorted array2 is "+Arrays.toString(array2));
			//sort the array2
			Arrays.sort(array2);
			System.out.println("my sorted array2 is " +Arrays.toString(array2));
		}
		

	}


