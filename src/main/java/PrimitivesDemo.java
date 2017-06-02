import java.util.Objects;

import static java.lang.System.out;

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
        out.println(accumulator);
        //endregion

        //region Precision
        out.println(.1f + .2f); //IEEE xxxx
        //endregion

        boolean boo = true | false;

        char c = '\u163A';
        //endregion

        //region Operators
        out.println(1 / 2);
        out.println(1 / 2f);

        float ff = 1/2;
        int ii = (int)(1f / 2);
        out.println(ii);

        out.println(10 % 2);

        byte counter = +0;
        out.println(++counter);
        counter += 1;

        out.println(1 + 2 + "3" + 4 + 5);

        int iii = 3_00;
        out.println((byte)iii);

        boolean result = !m1() || m2();
        out.println(~5 ^ 4 >>> 33 << 1);

        out.println(result ? "1" : true ? "2" : "3");

//        counter = counter + 1;
        //endregionxw

        //region Arrays
        int size = 5;
        int[][][] array = new int[size][5][0];
        out.println(array[0]);

        int[][] literalArray = {
                {},
                {1,2}
        };
        eatArray((new int[] {1,2}));

        //endregion

        //region Strings: intern
        String str1 = "abc";
        String str2 = "abc";
        out.println(str1 == str2);

        StringBuffer sbf = new StringBuffer("1");
        StringBuilder sbl;
        sbf.append("2");

//        (("12" + "222") + "444") + "666" + "777";
//        sbl.append("12").append("222")
        //endregion

        //region Overloading
        m(0);
        //endregion


    }

    private static boolean m2() {
        return false;
    }

    private static boolean m1() {
        return false;
    }

    private static void eatArray(int[] arg) {}

    private static int m(int a) { return 0; }
    private static byte m(byte a) { return 0; }
}

