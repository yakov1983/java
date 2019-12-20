public class Main {
    public static void main(String[] args) {
        //  Исключения
        // как только в программе происходит исключение программа крашится
        /*int a = 10;
        a = a / 0;**/

        // любое исключение есть в классе
        // можно самому задать класс с исключениями

        int index = 8;
        int[] a = new int[3];

        try {  // внутри помещаем код , который теоритически может вызвать исключение
            a[index] = 17;
            index = index / 0;
            System.out.println("Эта надпись не должна отобразится");
        }
        catch(ArrayIndexOutOfBoundsException e) {  // внутри catch описывается класс с исключением
            // это записывается в е
            // если исключения нет этот блок пропускается
            e.printStackTrace();
            System.out.println("Что- то пошло не так");
        }



        System.out.println("Я не вылетела ");

        // обработка и генерация пользовательских исключений
        try {
            //  throw  генерирует исключение
            throw new MyException();  //throw генерирует исключение без выделения памяти
        }
        catch (MyException e) {
            System.out.println(e.getMessage());
            System.out.println(e.timestamp);
        }

        try {
            test();
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
        catch (RuntimeException e) {

        }

        // порядок catcheй иммет значение
        // класс Exception и Throwable
        // должны находится ниже, чем пользовательские исключения
        // если среди catcheй присутствует класс
        // Exception и Throwable, то этот catch
        // сработает в том случае , если не сработатал
        // ни один из пользовательских классов - исключений.

        try {
            test();
        }
        catch (IndexOutOfBoundsException e) {

        }
        catch (Exception e) {
            System.out.println("&&&&&&&");
        }
        catch (Throwable e) {

        }

        //  Игра в угадай число

        Game game = new Game();
        game.start();
    }

    public  static void test() throws MyException, RuntimeException   {
        getMoney(100);
    }

    public static void getMoney(int money)throws MyException, RuntimeException  { // через запятую все классы исключения
        if (money <= 0 || money > 1000) {   // если вышли за диапозон делаем исключение
            throw  new MyException();
        }
        System.out.println("Деньги сняты");
        throw new RuntimeException();
    }
}
