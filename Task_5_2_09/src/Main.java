import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {
        Charset charset = StandardCharsets.US_ASCII;

        byte[] b = new byte[]{48, 49, 50, 51};
        InputStream inputStream = new ByteArrayInputStream(b);
        String str = readAsString(inputStream, charset);
        System.out.println(str);

        System.exit(0);

        int next = 0;
        int prev = System.in.read();
        while (prev != -1) {
            next = System.in.read();
            if (prev != 13 || next != 10) {
                System.out.write(prev);
            }
            prev = next;
        }
        System.out.flush();
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        Reader reader = new InputStreamReader(inputStream, charset);
        int i;
        StringBuilder str = new StringBuilder();
        while ((i = reader.read()) != -1) {
            str.append((char) i);
        }
        return str.toString();
    }

}
