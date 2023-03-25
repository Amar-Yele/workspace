
//import java.util.Scanner;
import java.util.Arrays;

public class RemoveDuplicates {
	
	
	//Creating RemoveDuplicate() method to remove duplicates from array  
  static void RemoveDuplicate(char ArrName[], int length){

  	
  	int index = 0;
    // Traversing character array  
      for (int i = 0; i < ArrName.length; i++){   
      	int j; 
          // Check whether ArrName is present before or not     
          for (j = 0; j < i; j++){
          	
              if (ArrName[i] == ArrName[j]){   
                  break;   
              }
          }
          if(j==i){
          	ArrName[index++] = ArrName[i];
          }
      }
      
      System.out.println(String.valueOf(Arrays.copyOf(ArrName, index))); 
  	
  }
	
 
	public static void main(String[] args) {
		
//		Scanner scan = new Scanner(System.in);	
//		String name = scan.next();
		
		System.out.println("Here is the Given String");
		String name = "satara";
		System.out.println(name);
//		Space will also removed from the string
		System.out.println("\nHere is the Duplicate removed String");
//		converted above String in Character Array
		char ArrName[] = name.toCharArray();
		int length = ArrName.length;
//		call RemoveDuplicate Method
		RemoveDuplicate(ArrName, length);

	}
}
