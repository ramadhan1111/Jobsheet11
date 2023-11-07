import java.util.Scanner;

public class SegitigaBintang {
     public static void main(String[] args) {
        Scanner sc25 = new Scanner(System.in);
        System.out.print("Masukkan nilai N= ");
        int n = sc25.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}