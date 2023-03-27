public class Subsequence {
    public boolean isSubsequence(String s, String t) {
        // 1 ms code beat 53% 
        // int si=0;
        // if(s.length()<1)
        //     return true;
        // for(int i=0;i<t.length();i++){
        //     if(s.charAt(si)==t.charAt(i))
        //         si++;

        //     if(si==s.length())
        //         return true;
        // }


    // 1 ms beat 100
    int i=0,j=0;
    char ss[]=s.toCharArray();
    char tt[]=t.toCharArray();

    if(s.length()<1)
        return true;

    while(i<t.length()){
        if(tt[i]==ss[j]){
            j++;
        }
        i++;
        
    if(j==s.length())
        return true;
    }

        return false;
    }
}