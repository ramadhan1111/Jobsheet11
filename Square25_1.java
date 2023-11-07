import java.util.Scanner;

public class Square25_1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nilai N = ");
        int N = sc.nextInt();

        for (int iOuter = 1; iOuter <= N; iOuter++){ //Berikut merupakan inisialisasi asli
            for (int i = 1; i <= N; i++){
            System.out.print("*");
            }
            System.out.println();
        }
        for (int iOuter = 0; iOuter <= N; iOuter++){ // Berikut merupakan inisialisasi soal 1
            for (int i = 1; i <= N; i++){
            System.out.print("*");
            }
            System.out.println();
        }
        for (int iOuter = 1; iOuter <= N; iOuter++){ // Berikut merupakan inisialisasi soal 2
            for (int i = 0; i <= N; i++){
            System.out.print("*");
            }
            System.out.println();
        }
    }
}