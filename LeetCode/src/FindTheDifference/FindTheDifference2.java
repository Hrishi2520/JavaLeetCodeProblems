public class FindTheDifference2 {
    public static char findTheDifference(String s, String t) {
        int[] a = new int[26];
        for(char c : s.toCharArray()) a[c - 'a']--;
        for(char c : t.toCharArray()) a[c - 'a']++;
        int i = 0;
        for(; i < 26; i++)
            if(a[i] == 1) break;
        return (char) (i +'a');  
    }
    public static void main(String[] args) {
    	String s = "", t = "y";
    	System.out.println(findTheDifference(s,t));
    }
}