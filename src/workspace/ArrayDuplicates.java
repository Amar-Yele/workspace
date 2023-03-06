package workspace;

import java.util.Scanner;

public class ArrayDuplicates  {

	public static void main(String[] args) {
		
// WAP to Print Duplicates in the ARRAYs 
		
//		let's Say we Create a Array 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter the Number which you want in Array:");
		
//		arr[0] = sc.nextInt();
//		arr[1] = sc.nextInt();
//		arr[2] = sc.nextInt();
			
		
		for(int i = 0; i<arr.length; i++) {
			
			arr[i] = sc.nextInt();
			
		}
		System.out.println("Given Array:");
		for (int arr1: arr) {
			System.out.print(arr1+" ");
		}
		System.out.println("\nDuplicate elements in above array:");
//		now we have to find the Duplicates are present or not in The GIVEN ARRAY
		
		for (int i=0; i<arr.length; i++) {
			for (int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
				}
			} 
		}System.out.println();
		

	}

}

