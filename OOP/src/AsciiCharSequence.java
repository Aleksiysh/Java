import java.util.Arrays;

public class AsciiCharSequence implements CharSequence {

    private final byte[] bytes;

    public AsciiCharSequence(String string) {
        bytes = string.getBytes();
    }

    public AsciiCharSequence(byte[] bytes){
        this.bytes = bytes;
    }

    @Override
    public int length() {
        return bytes.length;
    }

    @Override
    public char charAt(int index) {
        return (char) bytes[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        byte[] tmp = Arrays.copyOfRange(bytes,start,end);
        return new AsciiCharSequence(tmp);
    }

    @Override
    public String toString() {
        return new String(bytes);
    }
}
