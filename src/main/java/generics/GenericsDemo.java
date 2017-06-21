package generics;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

public class GenericsDemo {
    public static void main(String[] args) {
        //region showcase #1: diamond operator + autoboxing
        MyCollection<Number> c1 = new MyCollection<>();
        c1.add(1);
        //endregion

        //region showcase #2: types equality
        MyCollection<Number> c2 = new MyCollection<>();
        /**
         * Separate compile-time type system and runtime types!
         */
//        MyCollection<Number> c3 = new MyCollection<Integer>();
//        c3.get().intValue();

//        MyCollection<Integer> c4 = new MyCollection<Number>();
//        https://stackoverflow.com/questions/2745265/is-listdog-a-subclass-of-listanimal-why-arent-javas-generics-implicitly-p
        //endregion

        //region showcase #3: more complex type system
        MyCollection<? extends Number> c5 = new MyCollection<>();
        MyCollection<? extends Number> c6 = new MyCollection<Integer>();

        MyCollection<? super Number> c7 = new MyCollection<>();
        MyCollection<? super Number> c8 = new MyCollection<Object>();

        MyCollection c9 = new MyCollection<Number>();
        //endregion

        //region showcase #3: generic method
        MyCollection.<Number>addToEach("")
                .forEach(e -> e.byteValue());
        //endregion

    }
}

class MyCollection<T> {
    public void add(T element) {}
    public T get() { return null; }

    //region showcase #3: generic method
    public static <P> Collection<P> addToEach(String arg) {
        return null;
    }
    //endregion

    //region showcase #4: much more complex type system
    public static <P extends MyCollection & Serializable> P m2() { return null; }
    //endregion
}

//region showcase #5: fixing type parameter with inheritance/implementation
class MySuperCollection1 extends MyCollection {
    //what's T?
}
class MySuperCollection2<Integer> extends MyCollection {
    //what's T?
}
class MySuperCollection3 extends MyCollection<Integer> {
    //what's T?
}
//endregion
