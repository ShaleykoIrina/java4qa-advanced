import java.sql.Connection;
import java.sql.SQLException;
import java.util.function.Supplier;

public class TMDemo {
    public static void main(String[] args) {
        new SqlWorkflow(System.out::println);
    }
}

class MyyDbBusinessLogic implements Supplier {
    @Override
    public Object get() {
        c.createStatement().execute();
    }
}

class SqlWorkflow {
    private Supplier<Void> toDo;

    SqlWorkflow(Supplier<Void> toDo) {
        this.toDo = toDo;
    }

    public void execute() {
        Connection c = ;
        try {
            c = ???;

            //; -> toDo.get()

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

