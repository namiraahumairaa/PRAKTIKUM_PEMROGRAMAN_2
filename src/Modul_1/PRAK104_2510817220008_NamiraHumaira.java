package Modul_1;
import java.util.Scanner;

public class PRAK104_2510817220008_NamiraHumaira {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Tangan Abu: ");
        String pilihanAbuStr = scan.nextLine().replace(" ", "");

        System.out.print("Tangan Bagas: ");
        String pilihanBagasStr = scan.nextLine().replace(" ", "");

        if (pilihanAbuStr.length() < 3 || pilihanBagasStr.length() < 3) {
            System.out.println("Error: Input harus terdiri dari 3 ronde (contoh: G G K)");
            scan.close();
            return;
        }

        int poinAbu = 0;
        int poinBagas = 0;

        for(int i = 0; i < 3; i++) {
            char abu = pilihanAbuStr.charAt(i);
            char bagas = pilihanBagasStr.charAt(i);

            // Seri
            if (abu == bagas) {
            } else if ((abu == 'B' && bagas == 'G') ||
                    (abu == 'G' && bagas == 'K') ||
                    (abu == 'K' && bagas == 'B')) {
                poinAbu++;
            } else {
                poinBagas++;
            }
        }

        if(poinAbu > poinBagas) {
            System.out.println("Abu");
        } else if(poinBagas > poinAbu) {
            System.out.println("Bagas");
        } else {
            System.out.println("Seri");
        }

        scan.close();
    }
}