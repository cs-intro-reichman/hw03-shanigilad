/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String s) {
        String low = ""; 
        int n = s.length();

        for (int i = 0 ; i < n ; i++) {
            char letter = s.charAt(i);
                if (letter > 64 && letter < 91) {
                    int mid =  (int) letter + 32;
                    char lowercase = (char) mid;
                    low = low + lowercase; 
                } else {
                      low = low + (char) letter;
                }
        }
                return low;
    }
}
