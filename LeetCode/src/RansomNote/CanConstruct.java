public class CanConstruct {
    public static boolean canConstruct(String ransomNote, String magazine) {
		if (ransomNote.length() > magazine.length()) return false;
        int[] alphabets_counter = new int[26];
        
        for (char c : magazine.toCharArray())
            alphabets_counter[c-'a']++;

        for (char c : ransomNote.toCharArray()){
            if (alphabets_counter[c-'a'] == 0) return false;
            alphabets_counter[c-'a']--;
        }
        return true;
    }

    public static void main(String[] args) {
        String ransomNote = "a", magazine = "b";
        boolean result = canConstruct(ransomNote, magazine);
        System.out.println(result);
    }
}