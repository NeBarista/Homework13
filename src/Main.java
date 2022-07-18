public class Main {
    public static void main(String[] args) {
        System.out.println(triangle(5, 6, 8));
        System.out.println(triangle(8, 2, 1));
        System.out.println(triangle(9, 5, 4));
    }
    public static boolean triangle(int number1, int number2, int number3) {
        if (number1 + number2>number3) {
            return true;
        }
        if (number2 + number3>number1) {
            return true;
        }
        if (number3 + number2>number1) {
            return true;
        }
        else {
            return false;
        }
    }
}