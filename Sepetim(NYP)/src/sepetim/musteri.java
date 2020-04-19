/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sepetim;

/**
 *
 * @author Ufuk
 */
public class musteri {
    int musterino;
    String ad;
    String soyad;
    String alınan;
    musteri next,prev;
    public musteri(String alınan) {
        this.alınan = alınan;
//        System.out.println("----"+alınan);
    }
    
public void alısveris(){

}

    public musteri(int musterino, String ad, String soyad) {
        this.musterino = musterino;
        this.ad = ad;
        this.soyad = soyad;
        this.next=null;
        this.prev=null;
    }
    
}
