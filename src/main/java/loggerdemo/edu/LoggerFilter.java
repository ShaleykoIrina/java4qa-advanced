package loggerdemo.edu;

import java.io.Serializable;

/*
TODO
+ множественность имплементации
+ интерфейс как признак
+ необязательность модификаторов
+ переменные в интерфейсе
+ @Override
+ кастинг
+ реализация в интерфейсе
 */
public interface LoggerFilter extends Serializable {
    static final int MY_SUPER_CONST = 10;
    boolean filter(Object message);

    abstract boolean getLastFilterState();

    //region New j8 era
    static void m() {
        System.out.println("fff");
    }

    default void getLastFilteredMessages() {
        this.getLastFilterState();
    }
    //endregion
}

class ContractViolatorFilter implements LoggerFilter {
    @Override
    public boolean getLastFilterState() {
//        LoggerFilter.super.getLastFilterState();
        return false;
    }

    @Override
    public boolean filter(Object message) {
        return false;
    }

    @Override
    public void getLastFilteredMessages() {
    }
}