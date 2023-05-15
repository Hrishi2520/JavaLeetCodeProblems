class ShortestCompletingWord2 {
    public String shortestCompletingWord(String licensePlate, String[] words) {

        int[]mp=new int[26];

        String ans=null;

        int mini=Integer.MAX_VALUE;

        licensePlate=licensePlate.toLowerCase();

        for(int i=0;i<licensePlate.length();i++){

            if(Character.isAlphabetic(licensePlate.charAt(i))){

                mp[licensePlate.charAt(i)-'a']++;

            }

        }

        
        for(int i=0;i<words.length;i++){

            int[]temp=new int[26];

            if(words[i].length()<mini) {
                for(int j=0;j<words[i].length();j++){

                    temp[words[i].charAt(j)-'a']++;
                }

                boolean check=true;

                for(int k=0;k<26;k++){

                    if(temp[k]==0&&mp[k]!=0||temp[k]<mp[k]){
                        check=false;
                    }

                }

                if(check==true&&mini>words[i].length()){

                    ans=words[i];

                    mini=words[i].length();
                }

            }

        }

        return ans;
    }

}