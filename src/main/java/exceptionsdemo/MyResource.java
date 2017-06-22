package exceptionsdemo;

import java.io.Closeable;

public class MyResource implements Closeable {
    @Override
    public void close() {
        System.out.println("close");
    }
}
