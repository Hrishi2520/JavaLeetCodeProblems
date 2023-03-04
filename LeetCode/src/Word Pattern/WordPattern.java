import java.util.HashMap;
public class WordPattern {
    public static boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();

        String[] str = s.split(" ");

        if(str.length != pattern.length()) return false;

        for(int i=0; i<pattern.length(); i++){
            char a = pattern.charAt(i);
            if(!map.isEmpty() && map.containsKey(a) && !map.get(a).equals(str[i])) return false;

            if(!map.isEmpty() && map.containsKey(a) && map.get(a).equals(str[i])) continue;
    
            if(!map.isEmpty() && map.containsValue(str[i])) return false;
            
            map.put(a,str[i]);
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