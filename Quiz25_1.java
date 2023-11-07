import java.util.Random;
import java.util.Scanner;

public class Quiz25_1 {

    public static void main(String[] args) {
        // Inisialisasi variabel
        char menu = 'y';
        int number = new Random().nextInt(10) + 1;
        boolean success = false;

        // Mulai permainan
        do {
            // Minta input tebakan dari user
            System.out.print("Tebak angka (1-10): ");
            int answer = new Scanner(System.in).nextInt();

            // Periksa apakah tebakan benar
            success = (answer == number);

            // Tampilkan informasi mengenai tebakan
            if (!success) {
                if (answer < number) {
                    System.out.println("Tebakan Anda terlalu kecil!");
                } else {
                    System.out.println("Tebakan Anda terlalu besar!");
                }
            }

            // Tanyakan apakah ingin mengulang permainan
            System.out.print("Apakah Anda ingin mengulang permainan (Y/y)? ");
            menu = new Scanner(System.in).next().charAt(0);
        } while (menu == 'y' || menu == 'Y');

        // Akhir permainan
        System.out.println("Terima kasih telah bermain!");
    }
}