package generics;

import java.util.Arrays;
import java.util.Comparator;

public class GenericsDemo {
    public static void main(String[] args) {
        MyCollection<Number> myCollection = new MyCollection<>();
//        myCollection.add();

        Arrays.<Integer>asList(1,2,3).sort(
                (o1, o2) -> o1.byteValue()
        );
    }
}

class MyCollection<T extends Number> {
    public void add(T element) {}

    public T get() { return null; }
}
