import java.util.Stack;
class  ValidParentheses {
    private static boolean isValid(String s) {
        Stack<Character> bracket = new Stack<>();
        for(int i=0 ; i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='(' || ch =='{'|| ch=='['){
                bracket.push(ch);
            }else{
                if(bracket.empty()){
                    return false;
                }
                if((bracket.peek() == '(' && ch == ')') 
                || (bracket.peek() == '{' && ch == '}') 
                ||(bracket.peek() == '[' && ch == ']')){
                    bracket.pop();
                }else{
                    return false;
                }
            }
        }
        if(bracket.isEmpty()){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        String str = "{[()]}";
        String str1 = "{()]}";
        String str2 = "{[}";
        String str3 =  "()";
        System.out.println(isValid(str));
        System.out.println(isValid(str1));
        System.out.println(isValid(str2));
        System.out.println(isValid(str3));
    }
}
