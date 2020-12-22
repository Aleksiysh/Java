import java.util.Objects;

public final class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }



    @Override
    public boolean equals(Object obj) {
        if(this==obj) return true;
        if(obj instanceof ComplexNumber){
            if(this.re==((ComplexNumber) obj).re && this.im == ((ComplexNumber) obj).im) return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(re)*1023+Double.hashCode(im);
    }
}
