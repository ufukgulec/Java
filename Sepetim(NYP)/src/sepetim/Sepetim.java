/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sepetim;

import java.util.Scanner;

/**
 *
 * @author Ufuk
 */
public class Sepetim {

    static stok tv1 = new stok();

    static public void tv() {

        tv1.ekle(1, "Samsung TV", 1200.0);
        tv1.ekle(2, "LG TV", 2000.0);
        tv1.ekle(3, "SONY TV", 1500.0);
        tv1.ekle(4, "VESTEL TV", 550.0);
        tv1.ekle(5, "HP TV", 850.0);

        int tekrar = -1;
        do {
            System.out.println("--------------");
            System.out.println("1-ÜRÜN EKLE\n2-ÜRÜNLERİ SIRALA\n3-Stoktaki Ürünlerin Değeri\n4-Stoktaki Adet\n0-Üst Menü");
            int secim = sc.nextInt();
            switch (secim) {
                case 1:
                    System.out.print("Ürün id: ");
                    int id = sc.nextInt();
                    System.out.print("Ürün Markası: ");
                    String marka = sc.next();
                    System.out.print("Ürün fiyatı (Double değer): ");
                    double fiyat = sc.nextDouble();
                    tv1.ekle(id, marka, fiyat);
                    break;
                case 2:
                    tv1.listele();

                    break;
                case 3:
                    tv1.stokfiyat();
                    break;
                case 4:
                    tv1.stoksayısı();
                    break;
                case 0:
                    System.out.println("1-TELEVİZYON\n2-BİLGİSAYAR\n3-TELEFON");
                    int secim1 = sc.nextInt();

                    switch (secim1) {
                        case 1:
                            tv();
                        case 2:
                            pc();
                        case 3:
                            tel();

                    }
                default:
                    break;
            }
        } while (tekrar != 0);

    }

    static public void pc() {
        stok pc = new stok();
        pc.ekle(1, "Samsung PC", 2200.0);
        pc.ekle(2, "LG PC", 4000.0);
        pc.ekle(3, "SONY TV", 1500.0);
        pc.ekle(4, "VESTEL TV", 550.0);
        pc.ekle(5, "HP TV", 850.0);

        int tekrar = -1;
        do {
            System.out.println("--------------");
            System.out.println("1-ÜRÜN EKLE\n2-ÜRÜNLERİ SIRALA\n3-Stoktaki Ürünlerin Değeri\n4-Stoktaki Adet\n0-Üst Menü");
            int secim = sc.nextInt();
            switch (secim) {
                case 1:
                    System.out.print("Ürün id: ");
                    int id = sc.nextInt();
                    System.out.print("Ürün Markası: ");
                    String marka = sc.next();
                    System.out.print("Ürün fiyatı (Double değer): ");
                    double fiyat = sc.nextDouble();
                    pc.ekle(id, marka, fiyat);
                    break;
                case 2:
                    pc.listele();

                    break;
                case 3:
                    pc.stokfiyat();
                    break;
                case 4:
                    pc.stoksayısı();
                    break;
                case 0:
                    System.out.println("1-TELEVİZYON\n2-BİLGİSAYAR\n3-TELEFON");
                    int secim1 = sc.nextInt();

                    switch (secim1) {
                        case 1:
                            tv();
                        case 2:
                            pc();
                        case 3:
                            tel();

                    }
                default:
                    break;
            }
        } while (tekrar != 0);

    }

    static public void tel() {
        stok tel = new stok();
        tel.ekle(1, "Samsung A20", 1500.0);
        tel.ekle(2, "LG G5", 1000.0);
        tel.ekle(3, "SONY Z", 1500.0);
        tel.ekle(4, "VESTEL VENUS", 550.0);
        tel.ekle(5, "IPHONE 8", 2850.0);

        int tekrar = -1;
        do {
            System.out.println("--------------");
            System.out.println("1-ÜRÜN EKLE\n2-ÜRÜNLERİ SIRALA\n3-Stoktaki Ürünlerin Değeri\n4-Stoktaki Adet\n0-Üst Menü");
            int secim = sc.nextInt();
            switch (secim) {
                case 1:
                    System.out.print("Ürün id: ");
                    int id = sc.nextInt();
                    System.out.print("Ürün Markası: ");
                    String marka = sc.next();
                    System.out.print("Ürün fiyatı (Double değer): ");
                    double fiyat = sc.nextDouble();
                    tel.ekle(id, marka, fiyat);
                    break;
                case 2:
                    tel.listele();

                    break;
                case 3:
                    tel.stokfiyat();
                    break;
                case 4:
                    tel.stoksayısı();
                    break;
                case 0:
                    System.out.println("1-TELEVİZYON\n2-BİLGİSAYAR\n3-TELEFON");
                    int secim1 = sc.nextInt();

                    switch (secim1) {
                        case 1:
                            tv();
                        case 2:
                            pc();
                        case 3:
                            tel();

                    }
                default:
                    break;
            }
        } while (tekrar != 0);

    }

    /**
     */
    public static void personel() {
        System.out.println("1-TELEVİZYON\n2-BİLGİSAYAR\n3-TELEFON\n0-ÇIKIŞ");
        int secim1 = sc.nextInt();

        switch (secim1) {
            case 1:
                tv();
                break;
            case 2:
                pc();
                break;
            case 3:
                tel();
                break;
            default:
                break;
        }
    }

    public static void musteri() {
        System.out.print("Adınız: ");
        String mus_ad=sc.next();
        System.out.print("Soyadınız: ");
        String mus_soyad=sc.next();
        System.out.print("Müsteri numaranız: ");
        int mus_no=sc.nextInt();
        musteri m1=new musteri(mus_no, mus_ad, mus_soyad);
        
        
        
        
        
//        System.out.println("1-TELEVİZYON\n2-BİLGİSAYAR\n3-TELEFON\n0-ÇIKIŞ");
//        stok alısveris = new stok();
//        int secim1 = sc.nextInt();
//
//        switch (secim1) {
//            case 1:
//                tv1.listele();
//                break;
//            case 2:
//                pc();
//            case 3:
//                tel();
//        }

    }
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("1-MÜŞTERİ\n2-PERSONEL");
        int scm = sc.nextInt();

        switch (scm) {
            case 1:
                musteri();
                break;
            case 2:
                personel();
                break;
        }

    }

}
