import java.util.HashSet;
import java.lang.StringBuffer;
public class ReverseVowels2 {
    public static String reverseVowels(String s) {
    	int i = 0;
    	int j = s.length() - 1;
    	StringBuffer str = new StringBuffer(s);
    	HashSet<Character> set = new HashSet<>();
    	set.add('a');
    	set.add('e');
    	set.add('i');
    	set.add('o');
    	set.add('u');
    	set.add('A');
    	set.add('E');
    	set.add('I');
    	set.add('O');
    	set.add('U');

    	while(i < j) {
    		char a = s.charAt(i);
    		char b = s.charAt(j);
    		if(set.contains(a)) {
    			if(set.contains(b)) {
    				str.replace(i, i+1, ""+b);
    				str.replace(j, j+1, ""+a);
    				i++;
    			}
    			j--;
    		} else if(set.contains(b)) {
    			i++;
    		} else {
    			i++;
    			j--;
    		}
    	}
    	return str.toString();
    }
    public static void main(String[] args) {
    	String s = "leetcode";
    	String result = reverseVowels(s);
    	System.out.println(result.toString());
    }
}