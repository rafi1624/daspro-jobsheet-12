import java.util.Scanner;

public class PenjumlahanRekursif23 {
    public static String penjabaranPenjumlahan(int n) {
        if (n == 1) {
            return "1";
        } else {
            return penjabaranPenjumlahan(n - 1) + "+" + n;
        }
    }

    public static int hitungPenjumlahan(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + hitungPenjumlahan(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();
        String penjabaran = penjabaranPenjumlahan(n);
        int hasil = hitungPenjumlahan(n);
        System.out.println("Penjabaran: " + penjabaran);
        System.out.println("Hasil: " + hasil);
    }
}
