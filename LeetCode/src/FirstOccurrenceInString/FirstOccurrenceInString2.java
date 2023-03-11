public class FirstOccurrenceInString2 {
    public static int strStr(String haystack, String needle) {
        int haystacklen = haystack.length();
        int needlelen = needle.length();

        if(haystacklen<needlelen) return -1;

        for(int i = 0; i <= haystack.length()-needle.length(); i++) {
            int j = 0;
            while(j<needle.length() && haystack.charAt(i+j) == needle.charAt(j)) {
                j++;
                if(j == needle.length()) return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "leetcode";
        String needle = "leeto";
        int result = strStr(haystack, needle);
        System.out.println(result);
    }
}