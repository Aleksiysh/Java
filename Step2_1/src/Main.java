public class Main {

    public static void main(String[] args) {
        System.out.println(booleanExpression(true, true, false, false));
    }

    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        return (a ? 1 : 0) + (b ? 1 : 0) + (c ? 1 : 0) + (d ? 1 : 0) == 2;
    }
}
