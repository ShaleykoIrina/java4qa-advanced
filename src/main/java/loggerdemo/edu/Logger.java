package loggerdemo.edu;

public class Logger {
    /**
     * JavaDoc comment. <b>AHTUNG!!!! NOT NULL!!</b>
     * @param message
     * @param message
     * @throws
     */
    public static void log(String message) {
        if (filter(message)) {
            save(message);
        }
    }

    private static void save(String message) {
        System.out.println(message);
    }

    private static boolean filter(String message) {
        return !message.equals("fff");
    }
}

