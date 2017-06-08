package loggerdemo.edu;

/*
TODO
+ единственность наследования
+ доступ к полям через this
+ переопределение поведения и реюз кода предка
- реализация enum на обычных классах
- модификаторы доступа
- конструкторы: по умолчанию, свои, отработка у предков
 */
public abstract class LoggerSaver {
    public void save(String message) {
        System.out.println(message);
    }

    public void m() {}
}
