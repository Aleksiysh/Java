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

    private static void configureLogging() {
        // your implementation here
        java.util.logging.Logger logger;

        //Логгер с именем "org.stepic.java.logging.ClassA" принимал сообщения всех уровней.
        logger = java.util.logging.Logger.getLogger("org.stepic.java.logging.ClassA");
        logger.setLevel(Level.ALL);

        //Логгер с именем "org.stepic.java.logging.ClassB" принимал только сообщения уровня WARNING и серьезнее.
        logger = java.util.logging.Logger.getLogger("org.stepic.java.logging.ClassB");
        logger.setLevel(Level.WARNING);

        //Сообщения от всех логгеров с именами, начинающимися на "org.stepic.java"
        //независимо от уровня печатались в консоль в формате XML
        java.util.logging.ConsoleHandler handler =
                new java.util.logging.ConsoleHandler();
        handler.setFormatter(new java.util.logging.XMLFormatter());
        handler.setLevel(Level.ALL);

        logger = java.util.logging.Logger.getLogger("org.stepic.java");
        logger.addHandler(handler);

        //Сообщения от всех логгеров с именами, начинающимися на "org.stepic.java",
        //не передавались вышестоящим обработчикам ("org.stepic", "org" и "").
        logger.setUseParentHandlers(false);
    }
}
