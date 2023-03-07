import java.util.Arrays;
import java.util.List;
public class ReverseVowels3 {
    public static String reverseVowels(String s) {
        
        List<Character> list=Arrays.asList('a', 'e', 'i','o','u','A','E','I','O','U');

        char[] ch=s.toCharArray();

        System.out.println(Arrays.toString(ch));
        int i=0;
        int j=ch.length-1;

        while(i<j){

            if(list.contains(ch[i]) && list.contains(ch[j])){
                char temp=ch[i];
                ch[i]=ch[j];
                ch[j]=temp;
                i++;
                j--;
            }else if(list.contains(ch[i]) && !list.contains(ch[j])){
                j--;
            }else if(!list.contains(ch[i]) && list.contains(ch[j])){
                i++;
            }else if(!list.contains(ch[i]) && !list.contains(ch[j])){
                i++;
                j--;
            }

        }

        String res=String.valueOf(ch);
        return res;
    }
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(reverseVowels(s));
    }
}