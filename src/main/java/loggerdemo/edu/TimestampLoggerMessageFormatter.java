package loggerdemo.edu;

import java.util.Date;

public class TimestampLoggerMessageFormatter implements LoggerMessageFormatter {
    @Override
    public String format(String message) {
        return new Date() + " " + message;
    }
}
