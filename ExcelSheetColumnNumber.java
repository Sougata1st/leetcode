package leetcode;

public class ExcelSheetColumnNumber {
    //https://leetcode.com/problems/excel-sheet-column-number/description/
    public static void main(String[] args) {

    }
    public int titleToNumber(String columnTitle) {
        int result=0;

        for(int i=0;i<columnTitle.length();i++)
        {
            result*=26;
            // columnTitle[i] --> YE CURRENT ELEMENT KA ASCII CODE DEGA
            result+=(int)columnTitle.charAt(i)-(int)'A'+1;
        }
        return result;
    }
}
