package workspace;

import java.util.*;

public class PrimeNumberChecker {
	
	public static void main(String args[]) {
	
	Scanner Scan = new Scanner(System.in);
	
	System.out.println("Enter the Number:");
	int Num = Scan.nextInt();
	
	boolean isPrime = false;
	
//	Number Must be Greater than 1
	
	for(int i = 2; i<=Num/2; i++) {
		
		if(Num%i==0) {
			isPrime = true;
		}
	}
	
	if(!isPrime) {
		System.out.println("Given Number is Prime Number");
	}
	else {
		System.out.println("Given Number is Not a Prime");
	}
	

	}

}
