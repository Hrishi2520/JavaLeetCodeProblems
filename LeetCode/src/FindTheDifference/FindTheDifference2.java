public class FindTheDifference2 {
    public static char findTheDifference(String s, String t) {
        Map<Character, Integer>  map = new Hashmap<>();\

        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c,0)+1);
        }

        for(char c : t.toCharArray()) {
            if(map.containsKey(c) && map.get(c) == 0 || !map.containsKey(c)) return c;
            else map.put(c, map.get(c) -1);
        }
        return '!';
    }
    public static void main(String[] args) {
    	String s = "", t = "y";
    	System.out.println(findTheDifference(s,t));
    }
}