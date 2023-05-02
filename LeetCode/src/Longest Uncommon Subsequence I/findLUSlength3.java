class findLUSlength3 {
    public int findLUSlength(String a, String b) {
          if(a.contains(b) && b.contains(a)){
              return -1;
          }
           if(a.length()>b.length()){
               return a.length();
           }
           return b.length();
    }
}