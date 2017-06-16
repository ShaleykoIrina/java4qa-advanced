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

//package-friendly / default
class TimeStampLoggerMessage extends LoggerMessage {
    protected TimeStampLoggerMessage(String message) {
        super(message);
    }
}

class Main {
    public static void main(String[] args) {
        TimeStampLoggerMessage message = new TimeStampLoggerMessage("");
        System.out.println(message.getMessage());
    }
}

abstract class MYBL {
    public final void bl() {
        //.....
        this.step();
        //....
    }

     protected abstract void step();
}

class MyBLImpl extends MYBL {
    @Override
    protected void step() {
    }
}

class AppThatUseBl {
    public static void main(String[] args) {
        MYBL myBL = new MyBLImpl();
        myBL.bl();
    }
}