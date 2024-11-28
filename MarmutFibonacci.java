import java.util.Scanner;

public class MarmutFibonacci {
    public static int fibonacciMarmut(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibonacciMarmut(n - 1) + fibonacciMarmut(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bulan ke berapa: ");
        int bulan = scanner.nextInt();
        int totalPasangan = fibonacciMarmut(bulan);
        System.out.println("Jumlah total pasangan marmut pada akhir bulan ke-" + bulan + " adalah " + totalPasangan);
    }
}
