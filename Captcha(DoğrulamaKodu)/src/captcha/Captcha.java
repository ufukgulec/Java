/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package captcha;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Ufuk
 */
public class Captcha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        islem();
    }

    public static void islem() {
        Scanner sc = new Scanner(System.in);
        String captcha = dogrulamaKodu();
        System.out.println("CAPTCHA: " + captcha);
        System.out.print("Doğrula: ");
        String girilen = sc.next();
        kontrol(girilen, captcha);
    }

    public static String dogrulamaKodu() {
        Random rnd = new Random();
        int a = rnd.nextInt(9) + 1;
        int b = rnd.nextInt(10);
        int harfdegeri1 = rnd.nextInt(26) + 65;
        int harfdegeri2 = rnd.nextInt(26) + 65;
        char karakter1 = (char) harfdegeri1;
        char karakter2 = (char) harfdegeri2;
        String s = a + "" + karakter1 + "" + b + "" + karakter2;
        return s;
    }

    public static void kontrol(String girilen, String captcha) {
        if (girilen.contains(captcha)) {
            System.out.println("Doğru girdiniz..");
        } else if (captcha.contains(girilen.toUpperCase())) {
            System.out.println("Doğru fakat CAPSLOCK Kapalıyken yazdınız.");
        } else if (girilen.isEmpty()) {
            System.out.println("Boş bıraktınız.");
        } else {
            System.out.println("Yanlış girdiniz..");
            islem();
        }
    }
}
