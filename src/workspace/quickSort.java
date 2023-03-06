package workspace;

public class quickSort {
	
//	TIME COMPLEXITY of Quick SORT
//	Worst Case = O(n*2)
//	Average Case = O(nlogn)
	
	public static int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i = low-1;
		
		for(int j=low; j<high; j++) {
			if(arr[j]<pivot) {
				i++;
				
				// Swap 
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		i++;
		int temp = arr[i];
		arr[i] = pivot;
		arr[high] = temp;
		return i; //Pivot Index
	}
	
	public static void quickSort(int arr[], int low, int high) {
		if(low < high) {
			int pivotIndx = partition(arr, low, high);
			
			quickSort(arr, low, pivotIndx-1);
			quickSort(arr, pivotIndx+1, high);
			
		}
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {6, 3, 9, 5, 2, 8};
		int n = arr.length;
		
		quickSort(arr, 0, n-1);
		
//		print Quicksort
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();

	}

}
