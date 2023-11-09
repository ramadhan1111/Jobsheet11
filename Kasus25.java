import java. util.Scanner;

public class Kasus25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int batas = 5;
        
        // Loop luar untuk iterasi nilai pertama
        for (int i = 1; i <= batas; i++) {

            // Loop dalam untuk iterasi nilai kedua
            for (int j = 1; j <= batas; j++) {
                System.out.printf("%d x %d = %d\n", i, j, i * j);
            }
        }
    }
}
