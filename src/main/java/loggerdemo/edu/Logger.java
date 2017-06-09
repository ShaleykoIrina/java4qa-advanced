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
            switch (Sevrity.???) {
                case 1: ???
                case 2: ???
            }
            saver.save(formatter.format(message));

        }
    }
}

final class Severity {
    public static final Severity CRITICAL = new Severity(1, "CRITICAL");
    public static final Severity WARN = new Severity(2, "WARN");

    static valueOf() {}

    private int ordinal;
    private String name;

    Severity(int ordinal, String name) {
        this.ordinal = ordinal;
        this.name = name;
    }
}

enum Sever {
    CR(3), WA(5);

    private int my;

    Sever(int my) {
        this.my = my;
    }

    public void m() {}
}

enum SuperPuperServ extends Sever {}
