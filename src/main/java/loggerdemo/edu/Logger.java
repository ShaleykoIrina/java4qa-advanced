package loggerdemo.edu;

public class Logger {
    //GRASP: Creator
    private LoggerFilter filter = new FilterFactory().create(); //Factory -> Abstract Factory
    private LoggerSaver saver; //DI
    private LoggerMessageFormatter formatter;

    public Logger(LoggerFilter filter, LoggerSaver saver, LoggerMessageFormatter formatter) {
        this.filter = filter;
        this.saver = saver;
        this.formatter = formatter;
    }

    /**
     * JavaDoc comment. <b>AHTUNG!!!! NOT NULL!!</b>
     * @throws
     */
    public void log(String message) {
        if (filter.filter(message)) {
            saver.save(formatter.format(message));
        }
    }
}

