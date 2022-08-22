public class Homework2 {

    public static void main(String[] args) {
        //Даны радиус круга и сторона квадрата. У какой фигуры площадь больше? pi*r^2

        int r = 2;
        int a = 1;

        if ((Math.PI*r*r) > Math.pow(a,2)){
            System.out.println("Радиус круга больше");
        }
        else {
            System.out.println("Радиус квадрата больше");
        }
    }
}
