package Modul_1;
import java.util.Scanner;

public class PRAK103_2510817220008_NamiraHumaira {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukkan dua angka: ");
        int n = scan.nextInt();
        int bilanganAwal = scan.nextInt();

        int count = 0;
        int angkaSaatIni = bilanganAwal;

        System.out.println("HASIL: ");
        do {
            if (angkaSaatIni % 2 != 0) {
                System.out.print(angkaSaatIni);
                count++;
                if (count < n) {
                    System.out.print(", ");
                }
            }
            angkaSaatIni++;
        }while (count < n);

        System.out.println();
        scan.close();
    }
}