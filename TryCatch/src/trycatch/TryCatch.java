/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trycatch;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Ufuk
 */
public class TryCatch {

    /**
     * @param args the command line arguments
     */
    static int s = 0;
    static int dogru = 0;

    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Çıkmak için 0'a bas ");
        do {

            int a = r.nextInt(10);
            int b = r.nextInt(10);

            System.out.print(a + "*" + b + "=");
            try {
                NolursunGel(a, b, sc.nextInt());
            } catch (Exception e) {
                System.out.print(e.getMessage());
            }

        } while (s == 0);
    }

    static void NolursunGel(int a, int b, int cevap) throws Exception {
        if (a * b == cevap) {
            System.out.println("Aferin");
            dogru++;
        } else if (cevap == 00) {
            System.out.println("Dogru sayısı: " + dogru);
            s++;
        } else {
            System.out.println("Yanlış cevap");
        }
    }

}
