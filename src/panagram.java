import java.util.Scanner;

public class panagram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        boolean[] mark = new boolean[26];
        int index;
        for (int i = 0; i < str.length(); i++) {
            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
                index = str.charAt(i) - 'A';
            } else if ('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
                index = str.charAt(i) - 'a';
            } else {
                continue;
            }
            mark[index] = true;
        }
        boolean pangram = true;
        for (int i = 0; i < 26; i++) {
            if (!mark[i]) {
                pangram = false;
                break;
            }
        }
        if (pangram) {
            System.out.println("The string is a pangram.");
        } else {
            System.out.println("The string is not a pangram.");
        }
    }
}

//Enter your String and check whether it is Pangram or Not 
//if all letters of the alphabetes are present in the string then it will be print result as 
//"The String is a Pangram" else it will print as this is not an pangram

