package syslib;

import java.io.File;
import java.io.IOException;

public class SyslibDemo {
    public static void main(String[] args) throws IOException {
        System.getProperties().list(System.out);
        System.currentTimeMillis();
        System.nanoTime();
//        System.out.println('\r\n');
//        System.lineSeparator();
//        System.out.println(File.pathSeparator);
//        System.out.println(File.separator);

    }
}
