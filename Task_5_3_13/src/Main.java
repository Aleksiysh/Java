import java.io.Reader;
import java.io.StringReader;
import java.util.Scanner;

import static java.lang.Double.*;

public class Main {
    public static void main(String[] args) {
        double d = 0;
        Reader reader = new StringReader(
                "-1e3\n" +
                        "18 .111 11bbb");
        // Scanner scanner = new Scanner(System.in);
        Scanner scanner = new Scanner(reader);
        while (scanner.hasNext()) {
            try {
                d += Double.parseDouble(scanner.next());
            } catch (java.lang.NumberFormatException e) {
            }
        }
        System.out.printf("%.6f", d);
    }
}
