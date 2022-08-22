import java.util.Scanner;

public class Homework1 {

    public static void main(String[] args) {

        //В чемпионате по футболу команде за выигрыш дается 3 очка, за проигрыш — 0, за ничью — 1.
        // Известно количество очков, полученных командой за игру.
        // Определить словесный результат игры (выигрыш, проигрыш или ничья).
        Scanner sc = new Scanner(System.in);
        int result = sc.nextInt();
        switch (result){
            case (0):
                System.out.println("проигрыш");
                break;
            case (1):
                System.out.println("ничья");
                break;
            case (3):
                System.out.println("выигрыш");
                break;
            default:
                System.out.println("кол-во очков указано неверно");
        }
    }
}
