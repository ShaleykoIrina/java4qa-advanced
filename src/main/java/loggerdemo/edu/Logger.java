package loggerdemo.edu;

public class Logger {
     public static final String MY_SUPER_CONST = "QQQQQ";
     static int i;
    private static String message;

    /**
     * JavaDoc comment. <b>AHTUNG!!!! NOT NULL!!</b>
     * @throws
     */
    public static void log() {
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

