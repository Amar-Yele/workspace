package workspace;

public class bubbleSort {
	
	public static void printArray(int arr[]) {
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		int arr[] = {7, 8, 3, 1, 2};
		
		System.out.println("Array before Sort");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		// Bubble Sort
//		check elements using for loop
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-i-1; j++) {
				
				if(arr[j] > arr[j+1]) {
//				swap
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
//		here we to print array 
//		for that we have to call function and create a method name as printArray
		System.out.println("Array after Sort");
		printArray(arr);

	}
	

}
