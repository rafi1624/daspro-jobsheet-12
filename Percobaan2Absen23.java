import java.util.Scanner;

public class Percobaan2Absen23 {
    static Scanner sc = new Scanner(System.in); 
    static int bilangan, pangkat;

    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            System.out.print("x1"); 
            return 1;
        } else {
            System.out.print(x); 
            if (y > 1) {
                System.out.print("x");
            }
            return x * hitungPangkat(x, y - 1);
        }
    }

    public static void main(String[] args) {
        System.out.print("Bilangan Yang Dihitung: ");
        bilangan = sc.nextInt(); 
        System.out.print("Pangkat: ");
        pangkat = sc.nextInt();

        System.out.print("Hasil perhitungan: ");
        int hasil = hitungPangkat(bilangan, pangkat); 
        System.out.println(" = " + hasil); 
    }
}
