package longestCommonPrefix;

import java.util.Arrays;

class longestCommonPrefix {
    public String getLongestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        // Sorting the Given String array.
        Arrays.sort(strs);

        //Extracting first sorted element.
        char[] first = strs[0].toCharArray();
        //Extracting last sorted element.
        char[] last = strs[strs.length-1].toCharArray();

        //iterating over first anf last element of sorted strs array to get LCP. 
        for(int i = 0; i < first.length; i++) {
            //checking value of both the elements on index i
            //if not match give break. else append the i value to result.
            if(first[i] != last[i])
                break;
            result.append(first[i]);
        }//returning the result to function.
        return result.toString();
    }

    public static void main(String[] args) {

        longestCommonPrefix lcp = new longestCommonPrefix();

        String[] strs1 = {"flower","flow","flight"};
        System.out.println("Longest common prefix of str1 is: ");
        String lcp1 = lcp.getLongestCommonPrefix(strs1);
        System.out.println(lcp1);

        System.out.println("-".repeat(15)+"\n");
        String[] strs2 = {"dog","racecar","car"};
        System.out.println("Longest common prefix of str2 is: ");
        String lcp2 =lcp.getLongestCommonPrefix(strs2);
        System.out.println(lcp2);
    }
}
