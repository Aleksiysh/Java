import java.math.BigInteger;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] roles = new String[]{
                "GTh",
                "Городничий",
                "Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич",
                "Лука"
        };

        String[] textLines = new String[]{
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"
        };

        System.out.println(printTextPerRole(roles, textLines));
    }

    private static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder res = new StringBuilder("");
        for (String role : roles) {
            res.append(role);
            res.append(":\n");
            for (int i = 0; i < textLines.length; i++) {
                if (role.equals(textLines[i].substring(0, textLines[i].indexOf(":")))) {
                    String textLine = textLines[i].substring(role.length() + 2);
                    res.append((i + 1) + ") " + textLine + "\n");
                }
            }
            res.append("\n");
        }
        return res.toString();
    }


    /**
     * Merges two given sorted arrays into one
     *
     * @param a1 first sorted array
     * @param a2 second sorted array
     * @return new array containing all elements from a1 and a2, sorted
     */
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] res = new int[a1.length + a2.length];
        int i, j, k;
        i = j = k = 0;
        for (; i < res.length && j < a1.length && k < a2.length; i++)
            if (a1[j] < a2[k])
                res[i] = a1[j++];
            else
                res[i] = a2[k++];
        if (j < a1.length)
            for (; i < res.length; ++i)
                res[i] = a1[j++];
        else
            for (; i < res.length; ++i)
                res[i] = a2[k++];
        return res; // your implementation here
    }


    /**
     * 2.4.08
     * Calculates factorial of given <code>value</code>.
     *
     * @param value positive number
     * @return factorial of <code>value</code>
     */
    public static BigInteger factorial(int value) {
        BigInteger res = BigInteger.valueOf(1);
        for (int i = 1; i <= value; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res; // your implementation here
    }

    /**
     * 2.3.10
     * Checks if given <code>text</code> is a palindrome.
     *
     * @param text any string
     * @return <code>true</code> when <code>text</code> is a palindrome, <code>false</code> otherwise
     */
    public static boolean isPalindrome(String text) {
        text = text.replaceAll("[^A-Za-z1-9]", "");
        StringBuilder sbText = new StringBuilder(text);
        return text.equalsIgnoreCase(sbText.reverse().toString()); // your implementation here
    }

    /**
     * 2.2.9
     */
    public static boolean isPowerOfTwo(int value) {
        return Integer.bitCount(Math.abs(value)) == 1; // you implementation here
    }

    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        return (a ? 1 : 0) + (b ? 1 : 0) + (c ? 1 : 0) + (d ? 1 : 0) == 2;
    }

    public static int leapYearCount(int year) {
        int count = 0;
        for (int i = 1; i <= year; i++) {
            if (leapYear(i))
                count++;
        }
        return count;
    }

    static boolean leapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public static boolean doubleExpression(double a, double b, double c) {
        return Math.abs(a + b - c) < 1e-4;
    }

    /**
     * Flips one bit of the given <code>value</code>.
     *
     * @param value    any number
     * @param bitIndex index of the bit to flip, 1 <= bitIndex <= 32
     * @return new value with one bit flipped
     */
    public static int flipBit(int value, int bitIndex) {
        return value ^ 1 << (bitIndex - 1);
    }

    public static char charExpression(int a) {
        return (char) ((int) '\\' + a);
    }

}
