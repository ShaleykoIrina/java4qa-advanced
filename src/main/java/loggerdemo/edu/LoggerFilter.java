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
- реализация в интерфейсе
 */
public interface LoggerFilter extends Serializable {
    int MY_SUPER_CONST = 10;
    boolean filter(Object message);
}
