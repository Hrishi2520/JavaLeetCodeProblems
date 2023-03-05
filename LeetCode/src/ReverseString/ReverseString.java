import java.util.Arrays;
public class ReverseString {
    public static void reverseString(char[] s) {
        for(int i = 0; i < s.length/2; i++) {
            char first = s[i];
            char last = s[s.length - 1 - i];
            s[i] = last;
            s[s.length - 1 - i] = first;
         }
         System.out.println(Arrays.toString(s));
        
    }

    public static void main(String[] args) {
    	char[] s = {'h','e','l','l','o'};
    	reverseString(s);
    }
}