import java.math.BigInteger;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] a1 = new int[]{0, 2, 2};
        int[] a2 = new int[]{1, 3};
        System.out.println(Arrays.toString(mergeArrays(a1, a2)));
    }

    /**
     * Merges two given sorted arrays into one
     *
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
