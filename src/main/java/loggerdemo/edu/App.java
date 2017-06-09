package loggerdemo.edu;

import static loggerdemo.edu.Logger.log;

public class App {
    public static void main(String... args) {
        Logger logger = new Logger(new MessageContentLoggerFilter(), new ConsoleLoggerSaver(), formatter);
        logger.log("message", message -> null);

        System.out.println("R!");
        MessageBuilder()
                .withMessage("R!")
                .withDecorator(message -> {message + "timestapm"})
                .withLocale(new LocaleFactory())
                .withSaver(SaverFactory.createSaver())
            .build()
    }
}
