public class Main {

    public static void main(String[] args) {
        System.out.println(leapYearCount(
                100));
    }

    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        return (a ? 1 : 0) + (b ? 1 : 0) + (c ? 1 : 0) + (d ? 1 : 0) == 2;
    }

    public static int leapYearCount(int year) {
        int count =0;
        for (int i = 1; i <=year ; i++) {
            if(leapYear(i))
                count++;
        }
        return count;
    }

    static boolean leapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

}
