class NumJewelsInStones {
    public int numJewelsInStones(String jewels, String stones) {
        int sum = 0;

        if(jewels.length() == 0 || stones.length() == 0) return 0;
        for(int i = 0; i < jewels.length(); i++) {
            for(int j = 0; j < stones.length(); j++) {
                if(jewels.charAt(i) == stones.charAt(j)) sum++;
            }
        }
        return sum;
    }
}