public class LongestPalindrome2 {
    public int longestPalindrome(String s) {
        int odd_count = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch: s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            if (map.get(ch) % 2 == 1){
                odd_count ++;
            }
            else{
                odd_count--;
            }
        }
        if (odd_count > 1){
            return s.length() - odd_count + 1;
        }
        return s.length();
    }
}