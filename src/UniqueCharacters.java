public class UniqueCharacters {
    
    public static void main(String[] args) {
    	
//    	WAP to find if String contains all unique characters.
    	
        String str = "abcdef";
        boolean isUnique = true;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
        }

        if (isUnique) {
            System.out.println("The string contains all unique characters.");
        } else {
            System.out.println("The string does not contain all unique characters.");
        }
    }
}