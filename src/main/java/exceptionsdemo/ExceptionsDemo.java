package exceptionsdemo;

import loggerdemo.edu.Logger;

public class ExceptionsDemo {
    public static void main(String[] args) {
        log();
        //....
    }

    private static void log() {
        save();
        //...
    }

    private static void save() {
        LoggerFilterException loggerFilterException = null;
        try {
            //connection = openConnection();
            if (true) {
                throw new LoggerSaveException("system exception");
            }
        } catch (LoggerSaveException e) {
            loggerFilterException = new LoggerFilterException("business exception", e);
            throw loggerFilterException;
        } finally {
            try {
                //if(c != null) connection.close();
                connectionClose();
            } catch (RuntimeException e) {
                e.addSuppressed(loggerFilterException);
                throw e;
            }
        }
        //....
    }

    private static void connectionClose() {
        throw new RuntimeException("connection close error");
    }
}



class LoggerFilterException extends RuntimeException {
    public LoggerFilterException(String message, Throwable cause) {
        super(message, cause);
    }
}