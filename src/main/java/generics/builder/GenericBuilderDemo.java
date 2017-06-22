package generics.builder;

public class GenericBuilderDemo {
    public static void main(String[] args) {
        new Builder1<Builder3>();
    }
}

class Builder1<B extends Builder1> {
//    public B<? extends B> add1() { return null; }
}

class Builder2<B extends Builder2> extends Builder1<B> {
    public B add2() { return null; }
}

class Builder3<B extends Builder3> extends Builder2<B> {
    public B add3() { return null; }
}
