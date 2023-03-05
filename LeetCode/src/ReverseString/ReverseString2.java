import java.util.Arrays;
public class ReverseString2 {
    public static void reverseString(char[] s) {
        for(int i = 0; i < s.length/2; i++) {
            char first = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = first;
         }
         System.out.println(Arrays.toString(s));
        
    }

    public static void main(String[] args) {
    	char[] s = {'H','a','n','n','a','h'};
    	reverseString(s);
    }
}