package loggerdemo.edu;

public class Logger {
    //GRASP: Creator
    private LoggerFilter filter = new FilterFactory().create(); //Factory -> Abstract Factory
    private LoggerSaver saver; //DI

    public Logger(LoggerSaver saver) {
        this.saver = saver;
    }

    /**
     * JavaDoc comment. <b>AHTUNG!!!! NOT NULL!!</b>
     * @throws
     */
    public void log(String message) {
        if (filter.filter(message)) {
            saver.save(message);
        }
    }
}

