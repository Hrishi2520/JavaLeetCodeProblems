import java.math.*;
class AddStrings2 {
    public String addStrings(String num1, String num2) {
        // change to BigInteger and then add two numbers
        return ((new BigInteger(num1)).add((new  BigInteger(num2)))).toString();
    }
}