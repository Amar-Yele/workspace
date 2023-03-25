
public class MaximumOccurringCharacter {
	
    public static void main(String[] args) {
    	
//    	WAP to find the maximum occurring character in a String.
    	
        String str = "aaa bbbb cccc";
        int[] freq = new int[256];
        int maxFreq = -1;
        char maxChar = ' ';

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;

            if (freq[ch] > maxFreq) {
                maxFreq = freq[ch];
                maxChar = ch;
            }
        }

        System.out.println("Maximum occurring character is '" + maxChar + "' with frequency " + maxFreq + ".");
    }

}
