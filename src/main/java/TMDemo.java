import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.function.Supplier;

public class TMDemo {
    public static void main(String[] args) {
        new SqlWorkflow(arg -> "AAAAA!!!! Пощади!!!!!").execute();

        new ArrayList<String>().stream()
            .filter(el -> el.length() > 10)
            .sorted((e1,e2) -> e1.compareTo(e2) - 10)
            .map(Integer::parseInt)
            .forEach(System.out::println);
    }
}

//Template Method
class SqlWorkflow {
    private BLStrategy blStrategy;

    protected SqlWorkflow(BLStrategy blStrategy) {
        this.blStrategy = blStrategy;
    }

    public final void execute() {
        Connection c = ;
        try {
            c = ???;

            blStrategy.doBusinessLogic();

            while ((w = w.getNextWarning()) != null) {

            }
        } catch (SQLException e) {
            while ((e = e.getNextException()) != null) {

            }
        } finally {
            if (c != null) try {
                c.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }


}

@FunctionalInterface
interface BLStrategy {
     String doBusinessLogic(String param);
}