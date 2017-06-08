package loggerdemo.edu;

/*
TODO
+ единственность наследования
- доступ к полям через this
- реализация enum на обычных классах
- модификаторы доступа
- переопределение поведения и реюз кода предка
- конструкторы: по умолчанию, свои, отработка у предков
 */
public abstract class LoggerSaver {
    public void save(String message) {
        System.out.println(message);
    }

    public void m() {}
}
