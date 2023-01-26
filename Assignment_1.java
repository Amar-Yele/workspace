public class Assignment_1{

    public static void main(String[] args) {

        int n = 8;

// 1.Write a program(WAP) to print INEURON using pattern programming logic.
System.out.println("\nQ-1 --> INEURON");
        
        for(int i = 0; i<=n; i++){

            for(int j = 0; j<=n; j++){
                // print I
                if(j==n/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }    
            }
            //print N
            for(int j = 0; j<=n; j++){
                
                if((j==0) || j==n || i==j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            //print E
            for(int j = 0; j<=n; j++){
                
                if((j==2) || 
                (i ==0 && j>2 && j<n) ||
                (i==n/2 && j>2 && j<n) ||
                (i==n && j>2 && j<n))
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            //print U
            for(int j = 0; j<=n; j++){
                
                if((j== 2 && i<n) || 
                (i==n && j>2 && j<n-1) ||
                (j == n-1 && i<n))
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }


             //print R
             for(int j = 0; j<=n; j++){
                
                if((j==n/4) || 
                (i ==0 && j<3*n/4 && j>n/4) ||
                (i==n/2 && j>n/4 && j<3*n/4 ) |
                (j==3*n/4 && i>0 && i<n/2) ||
                (i == j && i>n/2))
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            //print O
            for(int j = 0; j<=n; j++){
                
                if((i==0 && j>2 && j<3*n/4) ||
                (i==n && j>2 && j<3*n/4) ||
                (j==1 && i>1 && i<n-1) ||
                (j==(3*n/4)+1 && i>1 && i<n-1) ||
                (i==1 && j==2) ||
                (i==1 && j==3*n/4) ||
                (i==n-1 && j==2) ||
                (i==n-1 && j==3*n/4)
                ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }


            //print N
            for(int j = 0; j<=n; j++){
                
                if((j==0) || j==n || i==j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }


            System.out.println();
        }
   

//2. Write a program to print
// 1 1 1 1
// 2 2 2 2
// 3 3 3 3
// 4 4 4 4

        int m = 4;

        System.out.println("\nTo Printing Numbers");

        for(int i = 1; i<=m; i++){
            for(int j = 1; j<=m; j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();

        }


// Q-3 Write a Program to print 
// **************
// ******  ******
// *****    *****
// ****      ****
// ***        ***
// **          **
// *            *
// *            *
// *            *
// *            *
// **************

        int o = 14;
        System.out.println("\nQ->3 --> print pattern");

        for(int i=0; i<=o; i++){
            for(int j=0; j<=o; j++){

                if((i==0) || (i==o) || (i+j<=o/2) || (j-i>=o/2) ||
                (j==0) || j==o)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }


/*
 *  Q-4 Write a Program to print following types of pattern
 * 
 *      
 *      
 * 
 *        *             *
 *        **           **
 *        ***         ***
 *        ****       ****
 *        *****     *****
 *        ******   ******
 *        ******* *******
 *        ***************
 * 
 * 
 */

            int p = 20;
            System.out.println("\nQ--> 4 ---> Print pattern:");

            for(int i=0; i<=p; i++){
                for(int j=0; j<=p; j++){
                    
                    if(
                        (j==0 && i>p/2 && i<p) || (j==p && i>p/2 && i<p) || (i==p) || (i==p-1) || (i-j>=p/2) || (i+j>=p+(p/2))
                    ){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }


// Q - 5 Write a Program to print following Pattern 

// **********
// ****
// ***
// **
// *
// **
// ***
// ****
// **********

            int q = 20;
            System.out.println("\nQ--> 5 --> PRINT PROGRAM FOR PATTERN:");

            for(int i = 0; i<=q; i++){

                for(int j=0; j<=q; j++){

                    if(i==0 || (i==q) || (i+j<=q/2 ) || (i-j>=q/2) || (j==0) )
                    {
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }

                System.out.println();
            }



    }

}
