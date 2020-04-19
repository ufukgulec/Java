/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gittigidecek;

import java.util.Scanner;

/**
 *
 * @author Ufuk
 */
public class Gittigidecek {

    static Scanner sc = new Scanner(System.in);

    static void tv(int sno) {
        stok s = new stok();
        s.tv.ekle(1, "Samsung", "Q55R SmartTv", 4.999, 55);
        s.tv.ekle(2, "Lg", "49UK", 3.455, 43);
        s.tv.ekle(3, "Vestel", "Satallite", 1.329, 22);
        s.tv.ekle(4, "Sony", "AG9", 23.599, 65);
        s.tv.ekle(5, "Philips", "The One", 5.699, 55);
        s.tv.listele();
        System.out.print("Ürün id gir: ");
        int id = sc.nextInt();
        s.tv.satis(id);
        s.siparis(sno, id);

    }

    static void pc(int sno) {
        stok s = new stok();
        s.pc.ekle(1, "Lenovo", "S-145", 3.699, 15);
        s.pc.ekle(2, "Hp", "Omen", 7.755, 17);
        s.pc.ekle(3, "Asus", "Rog", 6.499, 15);
        s.pc.ekle(4, "Casper", "Nirvana", 4.999, 15);
        s.pc.ekle(5, "Msi", "GF63", 5.699, 17);
        s.pc.listele();
        System.out.print("Ürün id gir: ");
        int id = sc.nextInt();
        s.pc.satis(id);
        s.siparis(sno, id);
    }

    static void tel(int sno) {
        stok s = new stok();
        s.tel.ekle(1, "Samsung", "A20", 1.755, 6);
        s.tel.ekle(2, "Lg", "V30", 2.199, 5);
        s.tel.ekle(3, "Vestel", "Venüs Z20", 1.599, 5);
        s.tel.ekle(4, "Huawei", "Mate 20 Lite", 2.399, 6);
        s.tel.ekle(5, "Apple", "Iphone 11Pro", 10.999, 6);
        s.tel.listele();
        System.out.print("Ürün id gir: ");
        int id = sc.nextInt();
        s.tel.satis(id);
        s.siparis(sno, id);
    }

    static void tab(int sno) {
        stok s = new stok();
        s.tab.ekle(1, "Apple", "Ipad 7", 2.3999, 10);
        s.tab.ekle(2, "Samsung", "Tab A8", 1.695, 9);
        s.tab.ekle(3, "Vestel", "V Tab", 1.529, 7);
        s.tab.ekle(4, "Hometech", "Alfa", 1.250, 7);
        s.tab.ekle(5, "Apple", "Ipad Pro", 9.600, 12);
        s.tab.listele();
        System.out.print("Ürün id gir: ");
        int id = sc.nextInt();
        s.tab.satis(id);
        s.siparis(sno, id);
    }

    public static void main(String[] args) {
        musteriler m = new musteriler();
        System.out.println("Adınız: ");
        String isim = sc.next();
        System.out.println("Soyadınız: ");
        String soyisim = sc.next();
        System.out.println("Müsteri No: ");
        int müsno = sc.nextInt();
        m.ekle(müsno, 0, isim, soyisim);
        m.ekle(100, 0, "ufuk", "güleç");

        int secim = -1;
        do {
            System.out.println("1- Televizyonlar\n2- Bilgisayarlar\n3- Telefonlar\n4- Tabletler\n0-Çıkış");
            secim = sc.nextInt();
            switch (secim) {
                case 1:
                    tv(müsno);
                    break;
                case 2:
                    pc(müsno);
                    break;
                case 3:
                    tel(müsno);
                    break;
                case 4:
                    tab(müsno);
                    break;

                default:
                    break;
            }
        } while (secim != 0);

    }

}
