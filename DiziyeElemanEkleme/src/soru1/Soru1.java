package soru1;

import java.util.Scanner;
public class Soru1 {
    public static void main(String[] args) {
        int[] dizi;
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen dizi boyutunu giriniz : ");
        dizi = new int[sc.nextInt()];
        System.out.println(dizi.length);
        for (int i = 0; i < dizi.length; i++) {
            System.out.print("Lütfen dizinin " + (i + 1) + ". değerini giriniz:");
            dizi[i] = sc.nextInt();
        }
        System.out.println("Girmiş olduğunuz dizi elemanları:");
        for (int i = 0; i < dizi.length; i++) {
            System.out.println("dizi[" + i + "]=" + dizi[i]);
        }
        System.out.print("Diziye eklenecek değeri giriniz:");
        int girilensayi = sc.nextInt();
        System.out.print("Bu değer dizinin hangi indisine eklensin?:");
        int indis = sc.nextInt();
        System.out.println("Eklemeden sonra dizinin elemanları:\n");
        ekle(girilensayi, indis, dizi);
    }

    public static void ekle(int girilen, int indis, int[] dizi) {
        int[] dizim = new int[dizi.length + 1];
        for (int i = 0; i < indis; i++) {
            dizim[i]=dizi[i];
        }
        dizim[indis]=girilen;
        for (int i = indis; i < dizi.length; i++) {
            dizim[i+1]=dizi[i];
        }
        for (int i = 0; i < dizim.length; i++) {
            System.out.println("dizi["+i+"]="+dizim[i]);
        }
    }
}
