public class PrimitivesDemo {
    public strictfp static void main(String[] args) {
        //region Primitives
        byte b = -10;
        short s = 0b10101;
        int i = 1;
        long l = 1_000_000_000_000_000L;

        float f = 3.F; //4
        double d = -2e-3; //8

        //region Overflow Example
        byte accumulator = Byte.MIN_VALUE;
        for (int counter = 0; counter < 257; counter++) {
            accumulator++;
        }
        System.out.println(accumulator);
        //endregion

        //region Precision
        System.out.println(.1f + .2f); //IEEE xxxx
        //endregion

        boolean boo = true | false;

        char c = '\u163A';
        //endregion

        //region Operators
        System.out.println(1 / 2);
        System.out.println(1 / 2f);

        float ff = 1/2;
        int ii = (int)(1f / 2);
        System.out.println(ii);

        System.out.println(10 % 2);

        byte counter = +0;
        System.out.println(++counter);
        counter += 1;

        System.out.println(1 + 2 + "3" + 4 + 5);

        int iii = 3_00;
        System.out.println((byte)iii);

        boolean result = !m1() || m2();
        System.out.println(~5 ^ 4 >>> 33 << 1);

        System.out.println(result ? "1" : true ? "2" : "3");

//        counter = counter + 1;
        //endregion

        //region Arrays
        int size = 5;
        int[][][] array = new int[size][5][0];
        System.out.println(array[0]);

        int[][] literalArray = {
                {},
                {1,2}
        };
        eatArray((new int[] {1,2}));

        //endregion

    }

    private static boolean m2() {
        return false;
    }

    private static boolean m1() {
        return false;
    }

    private static void eatArray(int[] arg) {}
}

