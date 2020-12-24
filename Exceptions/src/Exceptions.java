public class Exceptions {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    public static double sqrt(double x) {
        if (x < 0)
            throw new IllegalArgumentException("Expected non-negative number, got " + x);
        return Math.sqrt(x); // your implementation here
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {

        Throwable throwable = new Throwable();
        if (throwable.getStackTrace().length > 2) {
            StackTraceElement stackTraceElement = throwable.getStackTrace()[2];
            return stackTraceElement.getClassName() + "#" + stackTraceElement.getMethodName(); // your implementation here
        }
        return null;
    }
}


