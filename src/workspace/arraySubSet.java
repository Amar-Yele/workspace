package workspace;

public class arraySubSet {

	public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 4, 5};

        boolean isSubset = true;

        for (int i = 0; i < arr2.length; i++) {
            boolean found = false;
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                isSubset = false;
                break;
            }
        }

        if (isSubset) {
            System.out.println("arr2 is a subset of arr1");
        } else {
            System.out.println("arr2 is not a subset of arr1");
        }
    }
}

/*
In this code, we first define two arrays arr1 and arr2. 
We then initialize a boolean variable isSubset to true, assuming that arr2 is a subset of arr1.
We then use two nested for loops to iterate through arr2 and arr1. 
For each element of arr2, we check if it exists in arr1. 
If it does not exist in arr1, we set isSubset to false and break out of the loop.
After checking all elements of arr2, we check the value of isSubset and print the appropriate message to the console.
*/
