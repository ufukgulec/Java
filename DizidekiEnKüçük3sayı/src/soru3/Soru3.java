/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru3;

/**
 *
 * @author Ufuk
 */
public class Soru3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] dizi = {10, 9, 100, 81, 50, 10, 36, 90, -4, 8, 93, 43, 3, 5, 6};
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ". En küçük:" + enk3Sayi(dizi)[i]);
        }
    }

    public static int[] enk3Sayi(int[] dizi) {
        int[] küçükler = new int[3];
        for (int i = 0; i < küçükler.length; i++) {
            küçükler[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < küçükler.length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                if (küçükler[i] > dizi[j]) {
                    for (int k = 0; k < küçükler.length; k++) {
                        if (dizi[j]==küçükler[1]) {
                            break;
                        }else if (dizi[j]==küçükler[k]) {
                            break;
                        }else
                            küçükler[i]=dizi[j];
                    }
                }
            }
        }
        return küçükler;
    }
}
