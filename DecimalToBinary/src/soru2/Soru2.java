package soru2;

import java.util.Scanner;

/**
 *
 * @author Ufuk
 */
public class Soru2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sayi;

        do {
            System.out.print("Lütfen 10'luk tabandaki sayıyı giriniz:");
            sayi = sc.nextInt();
            System.out.println(ikilik(sayi));
        } while (sayi != -1);
    }

    public static int ikilik(int sayi) {
        if (sayi == 0) {
            return 0;
        } else {
            return (sayi % 2 + 10 * ikilik(sayi / 2));
        }
    }
}
