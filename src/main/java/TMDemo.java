import java.sql.Connection;
import java.sql.SQLException;
import java.util.function.Supplier;

public class TMDemo {
    public static void main(String[] args) {
        new SqlWorkflow().execute();
    }
}

//Template Method
abstract class SqlWorkflow {
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

interface BLStrategy {
     void doBusinessLogic();
}