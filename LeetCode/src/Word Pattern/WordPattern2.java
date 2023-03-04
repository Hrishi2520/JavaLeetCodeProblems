import java.util.HashMap;
public class WordPattern2 {
    public static boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        String[] str = s.split(" ");
        if(pattern.length() != str.length) return false;

        for(int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            if(map.containsKey(ch)) {
                if(!map.get(ch).equals(str[i])) return false;
            } else{
                if(map.containsValue(str[i])) return false;
                map.put(ch, str[i]);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba"; 
        String s = "dog cat cat dog";
        boolean result = wordPattern(pattern, s);
        if(result == true) {
            System.out.println("word pattern is sammilar...");
        } else {
            System.out.println("word pattern is not simmilar...");
        }
    }
}