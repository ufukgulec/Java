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
public class stok {

    int stokfiyat = 0;
    int stoksayısı = 0;
    urun ilk = null, son = null;

    public void ekle(int id, String marka, double fiyat) {
        urun o = new urun(id, marka, fiyat);
        if (ilk == null) {
            ilk = o;
            stokfiyat = (int) o.fiyat;
            son = o;
            stoksayısı++;
        } else {
            son.next = o;
            stokfiyat = (int) (stokfiyat + o.fiyat);
            o.prev = son;
            son = o;
            stoksayısı++;
        }
    }

    public void stokfiyat() {
        System.out.println("Stoktaki toplam ürün fiyatı: " + stokfiyat + "TL");
    }

    public void stoksayısı() {
        System.out.println("Stoktaki toplam ürün: " + stoksayısı + " Adet");
    }

    public void listele() {
        urun gecici = ilk;
        while (gecici != null) {
            
            String urunler=("Ürün id:" + gecici.id + " Marka: " + gecici.marka + " " + gecici.fiyat + "TL");
            musteri alısverıs=new musteri(urunler);
            System.out.println(urunler);
            gecici = gecici.next;
        }

    }
}
