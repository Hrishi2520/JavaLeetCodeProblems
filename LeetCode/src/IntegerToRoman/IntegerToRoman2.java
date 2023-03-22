class IntegerToRoman2 {
    public String intToRoman(int num) {
        return convertRoman(num/1000,4) + convertRoman((num%1000)/100,3) + convertRoman((num%100)/10,2) + convertRoman(num%10,1);
    }
    String convertRoman(int digit, int value) {
        String[] strs = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        String res= "";
        if (value==4) res = repeat("M", digit);
        else {
            int temp=0;
            if (value==3) temp=1;
            else if (value==2) temp=5;
            else temp=9;
            if(digit>=1 && digit<4) res+=repeat(strs[temp+3],digit);
            else if(digit==4) res+=strs[temp+2];
            else if(digit>=5 && digit<9) res+=strs[temp+1]+repeat(strs[temp+3],(digit-5));
            else if(digit==9) res+=strs[temp];
        }
        return res;
    }
    String repeat(String repeatVal, int num) {
        String ret="";
        while (num-->0) ret += repeatVal;
        return ret;
    }
   public static void main(String[] args) {
        int num = 58;
        System.out.println(intToRoman(num));
    }
}