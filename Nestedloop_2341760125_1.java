import java.util.Scanner;
public class Nestedloop_2341760125_1 {

    public static void main(String[] args) {
        // Inisialisasi variabel
        Scanner sc = new Scanner(System.in);
        int nKota = sc.nextInt();
        int nHari = sc.nextInt();
        double[][] temps = new double[nKota][nHari];

        // Membaca data suhu
        for (int i = 0; i < nKota; i++) {
            System.out.println("Kota ke-" + i);
            for (int j = 0; j < nHari; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = sc.nextDouble();
            }
            System.out.println();
        }

        // Menampilkan data suhu dan rata rata suhu
        for (int i = 0; i < nKota; i++) {
            System.out.println("Kota ke-" + (i + 1) + ": ");
            double total = 0;
            for (double temp : temps[i]) {
                total += temp;
            }
            double rata2 = total / nHari;
            System.out.println("Rata-rata: " + rata2);
        }        
    }
}
