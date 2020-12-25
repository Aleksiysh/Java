import java.util.Arrays;
import java.util.logging.*;

public class LoggingClass {
    private static final Logger LOGGER =
            Logger.getLogger(LoggingClass.class.getName());

    public static void main(String[] args) {
        LOGGER.log(Level.FINE, "Start with arguments: {0}", Arrays.toString(args));
        try {
            randomlyFailingAlgorithm();
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Exception cought", e);
            System.exit(2);
        }
        LOGGER.fine("Finished successfully");
    }

    private static void randomlyFailingAlgorithm() {
        double randomNumber = Math.random();
        LOGGER.log(Level.FINE, "Generated random number: {0}", randomNumber);
        if (randomNumber < 0.5) {
            throw new IllegalStateException("Invalid phase of the Moon");
        }
    }
}
