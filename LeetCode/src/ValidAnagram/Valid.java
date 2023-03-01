public class Valid {
    public static boolean isAnagram(String s, String t) {
        int alphas[] = new int[26];
        for(char ch : s.toCharArray()){
            alphas[ch-'a']++;
        }
        for(char ch : t.toCharArray()){
            alphas[ch-'a']--;
        }
        for(int i : alphas){
            if(i != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "rat";
        String t = "car";

        isAnagram(s, t);
    }
}