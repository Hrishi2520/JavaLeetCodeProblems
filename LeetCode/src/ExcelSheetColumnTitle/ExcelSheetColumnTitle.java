public class ExcelSheetColumnTitle {
    public static String convertToTitle(int columnNumber) {
        StringBuilder output = new StringBuilder();
        while(columnNumber > 0) {
            columnNumber--;
            char character = (char) (columnNumber % 26 + 'A');
            columnNumber /= 26;
            output.append(character);
        }
        output.reverse();
        return output.toString();
    }
     public static void main(String[] args) {
        int columnNumber = 701;
        String output = convertToTitle(columnNumber);
        System.out.println(columnNumber);
     }
}