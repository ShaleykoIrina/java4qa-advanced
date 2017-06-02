package loggerdemo.edu;

public class FilterFactory {
    public static LoggerFilter create() {
        return new MessageContentLoggerFilter();
    }
}
