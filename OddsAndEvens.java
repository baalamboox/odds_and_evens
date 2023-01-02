import java.util.Scanner;
public class OddsAndEvens {
    public static Scanner input = new Scanner(System.in);
    public static void oddEven() {
        int number = 1, counter = 0;
        while(number != 0) {
            if(counter < 10) {
                System.out.print("Ingresa un número entero: ");
                number = input.nextInt();
                if(number % 2 == 0) {
                    System.out.println("¡Es par!");
                } else {
                    System.out.println("¡No es par!");
                }
            } else {
                break;
            }
            counter++;
        }
    }
    public static void main(String[] args) {
        oddEven();
    }
}