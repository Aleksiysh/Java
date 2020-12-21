public class Main {

    public static void main(String[] args) {
        System.out.println(charExpression(29));
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
