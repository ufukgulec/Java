/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uygulama2;

import java.util.Scanner;

/**
 *
 * @author Ufuk
 */
public class tabanCevirme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//1,0lardan oluşan herhangi bir sayıyı istediğimiz tabana çeviren sayı
        Scanner sc = new Scanner(System.in);
        System.out.print("Çevrilecek sayı: ");
        String girilen = sc.next();
        while (true) {
            System.out.print("Hangi tabana: ");
            int taban = sc.nextInt();
            if (taban < 2 || taban > 10) {
                break;
            } else {
                System.out.println(taban + " tabanda sonuç= " + Integer.parseInt(girilen, taban));
            }
        }
    }
}
