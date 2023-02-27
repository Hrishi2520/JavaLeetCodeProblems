public class ExcelSheetColumnNumber {
    public static int titleToNumber(String columnTitle) {
       int output = 0;
        for(char c : columnTitle.toCharArray()) {
            output *= 26;
            output += c - 'A' + 1;
        }      
        return output;
    }

    public static void main(String[] args) {
    	String columnTitle = "A";
    	int result = titleToNumber(columnTitle);
    	System.out.println(result);
    }
}