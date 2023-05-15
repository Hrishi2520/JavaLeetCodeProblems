class ShortestCompletingWord3 {
    public String shortestCompletingWord(String s, String[] words) {
        Map<Character,Integer>map=new HashMap<>();
        int size=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(!Character.isDigit(ch) && ch!=' ')
            {
               ch = Character.toLowerCase(ch);
                if(map.containsKey(ch))
                {
                    size-=map.get(ch);
                }
                map.put(Character.toLowerCase(ch),map.getOrDefault(Character.toLowerCase(ch),0)+1);
                int val=map.get(ch);
                size+=val;   
            }
        }
        List<String>list=new ArrayList<>();
        for(String w:words)
        {
            int ans=0;
            Map<Character,Integer>wmap=new HashMap<>();
            char[] wrd=w.toCharArray();
            for(char ch:wrd)
            {   
                wmap.put(Character.toLowerCase(ch),wmap.getOrDefault(Character.toLowerCase(ch),0)+1);
            }
            for(char key:wmap.keySet()){
                
            if(map.containsKey(key))
            {
                  System.out.println(key+" "+wmap.get(key));
                if(map.get(key)<=wmap.get(key))
                ans+=map.get(key);
            }
           
            if(ans==size){
            list.add(w);
            break;
            }
        }
        }
        Collections.sort(list,(a,b)->a.length()-b.length());
        if(list.size()>=1)
        return list.get(0);
        else
        return"-1";
    }
}