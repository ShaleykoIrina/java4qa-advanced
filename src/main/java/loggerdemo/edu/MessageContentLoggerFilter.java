package loggerdemo.edu;


public class MessageContentLoggerFilter implements LoggerFilter {
    @Override
    public boolean filter(String message) {
        return !message.equals("fff");
    }

    public boolean filter(Object message) {
        return false;
    }
}
