public class IntegerToRoman {
    public static String intToRoman(int num) {
        return convertRoman(num/1000,4) + convertRoman((num%1000)/100,3) + convertRoman((num%100)/10,2) + convertRoman(num%10, 1);
    }
    String static convertRoman(int digit, int placeValue) {
        String res = "";
        switch(placeValue) {
            case 4:
                res = repeat("M", digit);
                break;
            case 3:
                if(digit >= 1 && digit < 4) res+= repeat("C", digit);
                else if(digit == 4) res+="CD";
                else if(digit>= 5 && digit < 9) res +="D"+repeat("C", (digit - 5));
                else if(digit == 9) res += "CM";
                break;
            case 2:
                if(digit >= 1 && digit < 4) res+= repeat("X", digit);
                else if(digit == 4) res+="XL";
                else if(digit>= 5 && digit < 9) res +="L"+repeat("X", (digit - 5));
                else if(digit == 9) res += "XC";
                break;
            case 1:
                if(digit >= 1 && digit < 4) res+= repeat("I", digit);
                else if(digit == 4) res+="IV";
                else if(digit>= 5 && digit < 9) res +="V"+repeat("I", (digit - 5));
                else if(digit == 9) res += "IX";
                break;
        }
	return res;
    }

    String staic repeat(String repeatVal, int num) {
        String ret = "";
        while(num --> 0) ret += repeatVal;
        return ret;
    }

    public static void main(String[] args) {
    	int num = 3;
    	System.out.println(intToRoman(num));
    }
}