class ShortestCompletingWord {
    public String shortestCompletingWord(String licensePlate, String[] words) {

        HashMap<Character,Integer>mp=new HashMap<>();

        String ans=null;

        int mini=Integer.MAX_VALUE;

        licensePlate=licensePlate.toLowerCase();

        for(int i=0;i<licensePlate.length();i++) {

            if(Character.isAlphabetic(licensePlate.charAt(i))) {

                if(!mp.containsKey(licensePlate.charAt(i))){
        
                   mp.put(licensePlate.charAt(i),1);

                }
                else{
                    mp.put(licensePlate.charAt(i),mp.get(licensePlate.charAt(i))+1);
                }

            }

        }

    
        for(int i=0;i<words.length;i++){

            HashMap<Character,Integer>temp=new HashMap<>();

            for(int j=0;j<words[i].length();j++){

                if(!temp.containsKey(words[i].charAt(j))){
                   temp.put(words[i].charAt(j),1);
                }
                else{
                    temp.put(words[i].charAt(j),temp.get(words[i].charAt(j))+1);
                }

            }
            boolean check=true;

            for(char m:mp.keySet()){

                if(!temp.containsKey(m)||temp.get(m)<mp.get(m)){
                    check=false;
                }
            }

            if(check==true&&mini>words[i].length()){

                ans=words[i];

                mini=words[i].length();
            }

        }

        return ans;
    }
}