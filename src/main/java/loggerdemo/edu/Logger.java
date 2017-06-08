package loggerdemo.edu;

import java.sql.Connection;

public class Logger {
    //GRASP: Creator
    private LoggerFilter filter = new FilterFactory().create(); //Factory -> Abstract Factory
    private LoggerSaver saver; //DI

    public Logger(LoggerFilter filter, LoggerSaver saver) {
        this.filter = filter;
        this.saver = saver;
        Connection.TRANSACTION_NONE
    }

    /**
     * JavaDoc comment. <b>AHTUNG!!!! NOT NULL!!</b>
     * @throws
     */
    public void log(String message) {
        if (filter.filter(message)) {
            /*
            if (filter instanceof MessageContentLoggerFilter) {
                ((MessageContentLoggerFilter) filter).filter(true);
            } else {
                ???
            }
            */
            saver.save(message);
        }
    }
}

