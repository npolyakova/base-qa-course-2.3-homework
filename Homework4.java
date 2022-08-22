import java.util.Scanner;

public class Homework4 {

   // Даны три вещественных числа a, b, c. Проверить: 
   // 1. выполняется ли неравенство a < b < c; 
   // 2. выполняется ли неравенство b > a > c.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите a");
        double a = sc.nextDouble();
        System.out.println("Введите b");
        double b = sc.nextDouble();
        System.out.println("Введите c");
        double c = sc.nextDouble();
        sc.close();

        if(a<b && b<c){
            System.out.println("Неравенство a < b < c выполняется");
        }
        else if (b>a && a>c){
            System.out.println("Неравенство b > a > c выполняется");
        }
        else {
            System.out.println("Ни одно неравенство не выполняется");
        }
    }
}
