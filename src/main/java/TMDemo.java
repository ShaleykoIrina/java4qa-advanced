import java.sql.Connection;
import java.sql.SQLException;
import java.util.function.Supplier;

public class TMDemo {
    public static void main(String[] args) {
        new MyBlWorkflow().execute();
    }
}

//Template Method
abstract class SqlWorkflow {
    public final void execute() {
        Connection c = ;
        try {
            c = ???;

            this.doBusinessLogic();

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

    protected abstract void doBusinessLogic();

}

class MyBlWorkflow extends SqlWorkflow {
    @Override
    protected void doBusinessLogic() {
        //
    }
}
