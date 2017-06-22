package syslib;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class SyslibDemo {
    public static void main(String[] args) throws IOException, CloneNotSupportedException {
        My clone = (My)new My().clone();
    }
}

class My implements Cloneable {
    private String name;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        My my = (My) o;

        return name != null ? name.equals(my.name) : my.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
