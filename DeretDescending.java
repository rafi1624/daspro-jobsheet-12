import java.util.Scanner;

public class DeretDescending {

    static void deretDescendingRekursif(int n) {
        if (n < 0) {
            return;
        }
        System.out.print(n + " ");
        deretDescendingRekursif(n - 1);
    }

    static void deretDescendingIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan n: ");
        int n = sc.nextInt();

        System.out.println("Deret bilangan menggunakan fungsi rekursif:");
        deretDescendingRekursif(n);
        System.out.println();

        System.out.println("Deret bilangan menggunakan fungsi iteratif:");
        deretDescendingIteratif(n);
        System.out.println();
    }
}
