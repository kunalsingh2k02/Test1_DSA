package Stack;

class Solution {
    public String convert(int n) {
        int decimal = octalToDecimal(n);
        return decimalToHexadecimal(decimal);
    }

    private int octalToDecimal(int n) {
        int decimal = 0;
        int base = 1;
        while (n > 0) {
            int lastDigit = n % 10;
            decimal += lastDigit * base;
            base *= 8;
            n /= 10;
        }
        return decimal;
    }

    private String decimalToHexadecimal(int n) {
        StringBuilder result = new StringBuilder();
        while (n > 0) {
            int remainder = n % 16;
            char hexDigit = getHexDigit(remainder);
            result.insert(0, hexDigit);
            n /= 16;
        }
        return result.toString();
    }

    private char getHexDigit(int n) {
        if (n >= 0 && n <= 9) {
            return (char) (n + '0');
        } else {
            return (char) (n - 10 + 'A');
        }
    }
}
public class Q1_Main{
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.convert(125715));
        System.out.println(s.convert(175));
    }
}
