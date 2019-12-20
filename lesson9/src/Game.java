import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private  int number;
    private int nCount;

    public Game() {
        // генерация случайных чисел
        // 1 способ
        //double r = Math.random();  // r[0;1]
        // r * (max - min) + min; => [min, max]
        // 2 способ
        Random rand = new Random(); //  класс Random
        this.number = rand.nextInt(100) + 1;
    }

    public  void start() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Введите число: ");
            int user;
            try {
                user = sc.nextInt();
            }
            catch (InputMismatchException e) {  // можно записать Exception работает 100 процентов, но сделаем по другому
                System.out.println("Введите корректное число!");
                sc = new Scanner(System.in);// надо чтобы корректно работало, иначе забивается буфер при неправильном вводе
                continue;
            }
            this.nCount++;
            if (this.number == user) {
                System.out.println("Поздравляем!");
                System.out.print("Вы угадали число за ");
                System.out.print(this.nCount);
                System.out.println(" попыток");
                break;
            }

            if (this.number > user) {
                System.out.println("Загаданное число больше");
            }


            if (this.number < user) {
                System.out.println("Загаданное число меньше");
            }
        }
    }
}
