package exceptionsdemo;

import loggerdemo.edu.Logger;

import java.io.IOException;

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
        try (
                MyResource resource = new MyResource();
                MyResource resource2 = new MyResource();
                MyResource resource3 = new MyResource();
                MyResource resource4 = new MyResource();
            ) {

            //....

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("my");

        }
        //....

        try {
            //.......RunExc
            //...NPE
        } catch (NullPointerException | NumberFormatException e) {
            //....
        }
    }

    private static void connectionClose() throws LoggerFilterException {
        throw new LoggerFilterException("", null);
    }
}



class LoggerFilterException extends Exception {
    public LoggerFilterException(String message, Throwable cause) {
        super(message, cause);
    }

    public LoggerFilterException() {
        super();
    }

    public LoggerFilterException(String message) {
        super(message);
    }

    public LoggerFilterException(Throwable cause) {
        super(cause);
    }

    protected LoggerFilterException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}