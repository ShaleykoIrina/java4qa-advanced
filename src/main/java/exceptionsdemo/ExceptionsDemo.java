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
        try (MyResource resource = new MyResource()) {

            //....

        } catch (RuntimeException e) {

        }  finally {
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

    private static void connectionClose() {
        throw new RuntimeException("connection close error");
    }
}



class LoggerFilterException extends RuntimeException {
    public LoggerFilterException(String message, Throwable cause) {
        super(message, cause);
    }
}