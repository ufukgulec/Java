/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obs;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ufuk
 */
public class Obs {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int secim = -1;
        liste1 ogrenciler = new liste1();//tek yönlü ve çift yönlü de var
        Scanner sc = new Scanner(System.in);
        do {
            try {//filewriter kullandığım için
                System.out.println("------------------");
                System.out.println("1-Ekle\n2-Listele\n3-Sil\n0-Çıkış");
                secim = sc.nextInt();
                switch (secim) {
                    case 1:
                        System.out.print("Öğrencinin numarasını giriniz: ");
                        int no = sc.nextInt();
                        System.out.print("Öğrencinin adını giriniz: ");
                        String ad = sc.next();
                        System.out.print("Öğrencinin soyadını giriniz: ");
                        String soyad = sc.next();
                        System.out.print("Öğrencinin notunu giriniz: ");
                        int not = sc.nextInt();
                        ogrenciler.ekle(no, not, ad, soyad);//okuduğu değerleri gönderiyor...
                        break;
                    case 2:
                        ogrenciler.listele();
                        System.out.println("Çıktı oluşmuştur");
                        break;
                    case 3:
                        System.out.println("silmek istediğiniz öğrenci nosu: ");
                        int silinecek = sc.nextInt();
                        ogrenciler.sil(silinecek);
                        System.out.println("Silindi...");
                }
            } catch (IOException ex) {
                Logger.getLogger(Obs.class.getName()).log(Level.SEVERE, null, ex);
            }
        } while (secim != 0);

    }

}
