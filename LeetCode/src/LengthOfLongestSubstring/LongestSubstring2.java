public class LongestSubstring2 {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character>set=new HashSet<>();
        int maxLength=0;
        int index=0;
        for(int i=0;i<s.length();i++){
           
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                maxLength=Math.max(maxLength,i-index+1);
                
            }else{
                while(s.charAt(index)!=s.charAt(i)){
                    set.remove(s.charAt(index));
                    index++;
                }
                set.remove(s.charAt(index));index++;
                set.add(s.charAt(i));
            }
            
        }
        return maxLength;
    }
    public static void main(String[] args) {
        String str = "pwwkew";
        System.out.println(lengthOfLongestSubstring(str));
    }
}