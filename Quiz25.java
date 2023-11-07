import java.util.Scanner;
import java.util.Random;

public class Quiz25 {
    public static void main(String[] args) {
        
        Scanner sc25 = new Scanner(System.in);
        Random random25 = new Random();
        char menu = 'y';

        do{
            int number = random25.nextInt(10) + 1;
            boolean success = false;
            do{
                System.out.print("Tebak Angka (1-10): ");
                int answer = sc25.nextInt();
                sc25.nextLine();
                success = (answer == number);
            }while (!success);
            System.out.print("Apakah Anda ingin mengulang permainan (Y/y)?");
            menu = sc25.nextLine().charAt(0);
        }while (menu == 'y' || menu == 'Y');
    }
}