import java.util.Scanner;

public class Percobaan3Absen23 {
    static Scanner sc = new Scanner(System.in);
    static int saldoAwal,tahun;

    static double hitungLaba(double saldo, int tahun){
        if (tahun == 0) {
            return (saldo);
        } else {
            return (1.11 * hitungLaba(saldo, tahun - 1));
        }
    } public static void main(String[] args) {
        System.out.print("Jumlah Saldo Awal : ");
        saldoAwal = sc.nextInt();
        System.out.print("Lamanya Investasi (Tahun) : ");
        tahun = sc.nextInt();

        double saldoAkhir = hitungLaba(saldoAwal, tahun);
        System.out.println("Saldo Akhir Setelah " + tahun + " Tahun Adalah : " + saldoAkhir);
    }
}