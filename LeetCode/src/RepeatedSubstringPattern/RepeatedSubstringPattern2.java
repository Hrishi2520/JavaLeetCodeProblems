class RepeatedSubstringPattern2 {
    public boolean repeatedSubstringPattern(String s) {
      int n = s.length();
      for(int i = n/2; i > 0; i--) {
        if(n % i == 0) {
          int j = 0;
          while( j + i < n && s.charAt(j) == s.charAt(i + j)) 
            j++;
          if(i + j == n) return true;
        }
      }
      return false;
    }
}