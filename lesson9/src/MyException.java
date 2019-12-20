public class MyException extends Exception {
    // в основном переопределяется getMessage, которое внутри Exception

    public long timestamp;

    public MyException() {
        super();  // подтянули конструктор из предыдущего класса
        this.timestamp = System.currentTimeMillis();  // возвращает количество миллисекунд с 1го 1970 (Юникстайм)
    }

    @Override
    public String getMessage() {
        return "MyException error";
    }
}
