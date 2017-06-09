package loggerdemo.edu;

public class Logger {
    //GRASP: Creator
    private LoggerFilter filter = new FilterFactory().create(); //Factory -> Abstract Factory
    private LoggerSaver saver; //DI

    public Logger(LoggerFilter filter, LoggerSaver saver) {
        this.filter = filter;
        this.saver = saver;
    }

    /**
     * JavaDoc comment. <b>AHTUNG!!!! NOT NULL!!</b>
     * @throws
     */
    public void log(String message, LoggerMessageFormatter formatter) {
        if (filter.filter(message)) {
            saver.save(formatter.format(message));
        }
    }
}

