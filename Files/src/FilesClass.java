import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;


public class FilesClass {
    public static void main(String[] args) {

        System.out.println("Files");
        byte[] b = new byte[]{0x33, 0x45, 0x01};

        InputStream inputStream = new ByteArrayInputStream(b);
    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        while (read > 0) {
            read = inputStream.read();
            System.out.println(read.toString());
        }
        ;
        return 0;
    }
}
