public class LetterCombinations2 {
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if(digits.length() == 0) return list;

        HashMap<Character, String> hm = new HashMap<>();
        hm.put('2',"abc");
        hm.put('3',"def");
        hm.put('4',"ghi");
        hm.put('5',"jkl");
        hm.put('6',"mno");
        hm.put('7',"pqrs");
        hm.put('8',"tuv");
        hm.put('9',"wxyz");

        backtrack(digits, 0, hm, new StringBuilder(), list);
        return list;
    }
    private static void backtrack(String digits, int i,HashMap<Character, String> hm, StringBuilder sb, List<String> ans) {
        if(i == digits.length()) {
            ans.add(sb.toString());
            return;
        }
        String curr = hm.get(digits.charAt(i));
        for(int k = 0; k < curr.length(); k++) {
            sb.append(curr.charAt(k));
            backtrack(digits, i+1, hm, sb, ans);
            sb.deleteCharAt(sb.length()-1);
        }
    }

    public static void main(String[] args) {
        String digits = "223";
        List<String> list = new ArrayList<>();
        list = letterCombinations(digits);
        System.out.println(list.toString);
    }
}