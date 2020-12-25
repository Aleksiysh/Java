import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;


public class FilesClass {
    public static void main(String[] args) throws IOException {

        System.out.println("Files");
        byte[] b = new byte[]{0x33, 0x45, 0x01};

        InputStream inputStream = new ByteArrayInputStream(b);
        int a = checkSumOfStream(inputStream);
        System.out.println(a);
    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int sum = 0;
        int n;
        while ((n = inputStream.read()) != -1) {
            sum = Integer.rotateLeft(sum, 1) ^ n;
        }
        return sum;
    }
}
