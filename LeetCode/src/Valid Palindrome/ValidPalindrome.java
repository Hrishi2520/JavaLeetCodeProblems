import java.lang.*;
public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        if (s.isEmpty()) {
        	return true;
        }
        int start = 0;
        int last = s.length() - 1;
        while(start <= last) {
        	char currFirst = s.charAt(start);
        	char currLast = s.charAt(last);
        	if (!Character.isLetterOrDigit(currFirst )) {
        		start++;
        	} else if(!Character.isLetterOrDigit(currLast)) {
        		last--;
        	} else {
        		if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
        			return false;
        		}
        		start++;
        		last--;
        	}
        }
        return true;
    }

    public static void main(String[] args) {
        String first = "A man, a plan, a canal: Panama";
        String second = "race a car";

        System.out.println("is \'"+ first + "\' String palindrom? "+isPalindrome(first));
        System.out.println("is \'"+ second + "\'' palindrom? "+isPalindrome(second));
    }

}