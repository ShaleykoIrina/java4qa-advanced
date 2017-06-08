package loggerdemo.edu;

public class ConsoleLoggerSaver extends LoggerSaver {
    @Override
    public void save(String message) {
        System.out.println(">> ");
        super.save(message);
        System.out.println(" <<");
    }
}
