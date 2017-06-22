package exceptionsdemo;

/**
 * Created by eugene on 22/06/2017.
 */
public class LoggerSaveException extends RuntimeException {
    public LoggerSaveException(String message) {
        super(message);
    }
}
