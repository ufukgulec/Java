/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayıntarlası;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Ufuk
 */
public class MayınTarlası {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tarla[][];
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen Satır Sayısını Giriniz: ");
        int satir = sc.nextInt();
        System.out.print("Lütfen Sütun Sayısını Giriniz: ");
        int sütun = sc.nextInt();
        System.out.print("Lütfen 20 ile 80 arasında olacak şekilde oyunun zorluk derecesini giriniz: ");
        int zorlukYüzdesi = sc.nextInt();
        while (20 > zorlukYüzdesi || 80 < zorlukYüzdesi) {
            System.out.print("Lütfen zorluk derecesini 20 ile 80 arasında olacak şekilde giriniz: ");
            zorlukYüzdesi = sc.nextInt();
        }
        tarla = new int[satir][sütun];
        String gösterim[][] = new String[satir][sütun];
        int puan = 0;
        for (int i = 0; i < satir; i++) {//Gösterim * tablosu
            for (int j = 0; j < sütun; j++) {
                gösterim[i][j] = "*";
            }
        }

        for (int i = 0; i < satir; i++) {//tarlanın 0larla doldurulması (olsuturulması)
            for (int j = 0; j < sütun; j++) {
                tarla[i][j] = 0;
            }
        }
        Random r = new Random();
        int zorluk = (satir * sütun) / (100 / zorlukYüzdesi);
        for (int i = 0; i < zorluk; i++) {//0 tarlasına 1lerin rastgele yerleştirilmesi
            tarla[r.nextInt(satir)][r.nextInt(sütun)] = 1;
        }

        for (int i = 0; i < satir; i++) { //Gösterim * tablosunun ekrana basılması
            for (int j = 0; j < sütun; j++) {
                System.out.print(gösterim[i][j] + " ");
            }
            System.out.print("\n");
        }

        int secim = 0;
        while (secim == 0) {//Oyun basladı
            System.out.print("Lütfen Satır Değerini Giriniz: ");
            int satirdegeri = sc.nextInt();
            while (satirdegeri > satir - 1) {
                System.out.print("Lütfen satır değerini 0 ile " + (satir - 1) + " arasında giriniz: ");
                satirdegeri = sc.nextInt();
            }
            System.out.print("Lütfen Sütun Değerini Giriniz: ");
            int sütundegeri = sc.nextInt();
            while (sütundegeri > sütun - 1) {
                System.out.print("Lütfen sütun değerini 0 ile " + (sütun - 1) + " arasında giriniz: ");
                sütundegeri = sc.nextInt();
            }
            if (tarla[satirdegeri][sütundegeri] == 0) {
                gösterim[satirdegeri][sütundegeri] = "0";
                for (int i = 0; i < satir; i++) {
                    for (int j = 0; j < sütun; j++) {
                        System.out.print(gösterim[i][j] + " ");
                    }
                    System.out.print("\n");
                }
                puan += 10;
            } else {
                System.out.println("Kaybettiniz Puanınız: " + puan);
                for (int i = 0; i < satir; i++) { //oyun sonu tarla ekran basımı
                    for (int j = 0; j < sütun; j++) {
                        System.out.print(tarla[i][j] + " ");
                    }
                    System.out.print("\n");
                }
                break;
            }
        }
    }
    
}
