import java.util.Scanner;

public class Homework5 {
    //Даны два числа. Если квадратный корень из второго числа меньше первого числа, то увеличить второе число в пять раз.
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите a");
        int a = sc.nextInt();
        System.out.println("Введите b");
        int b = sc.nextInt();
        sc.close();

        if (Math.sqrt(b) < a){
            b *= 5; //b = b * 5
        }

        System.out.printf("a равно %d, b равно %d", a, b);
    }
}
