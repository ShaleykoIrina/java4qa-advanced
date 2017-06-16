package loggerdemo.edu;

public class LoggerMessage {
    private String message;

    public LoggerMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

class TimeStampLoggerMessage extends LoggerMessage {
    public TimeStampLoggerMessage(String message) {
        super(message);
    }
}

class Main {
    public static void main(String[] args) {
        TimeStampLoggerMessage message = new TimeStampLoggerMessage("");
        System.out.println(message.getMessage());
    }
}