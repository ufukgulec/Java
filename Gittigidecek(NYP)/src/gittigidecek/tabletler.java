/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gittigidecek;

/**
 *
 * @author Ufuk
 */
public class tabletler {
    tablet ilk=null,son=null;
    public void ekle(int id, String marka, String model, double fiyat, int boyut) {
    
        tablet o = new tablet(id, marka, model, fiyat, boyut);
        if (ilk == null) {
            ilk = o;
            son = o;

        } else {
            son.sonraki = o;
            o.onceki = son;
            son = o;

        }
    }
    public void satis(int urunid) {

        tablet gecici = ilk;
        while (gecici != null) {
            if (gecici.no == urunid) {
                System.out.println("Ürün id:" + gecici.no + " Marka: " + gecici.marka + " Model: " + gecici.model + " Fiyat: " + gecici.fiyat + " Boyut: " + gecici.boyut);
                sorgu(gecici.fiyat);
                break;
                
            }
            gecici = gecici.sonraki;
        }
        if (gecici == null) {
            System.out.println("Ürün id yanlış");
        }
        
    }
    public void sorgu(double borc){
        System.out.println("Borcunuz: "+borc);
    }
    public void listele() {
        tablet gecici = ilk;
        while (gecici != null) {
            
            String urunler=("Ürün id:" + gecici.no + " Marka: " + gecici.marka + " Model: "+gecici.model +" Fiyat: "+ gecici.fiyat + " Boyut: "+gecici.boyut);
            gecici = gecici.sonraki;
            System.out.println(urunler);
        }

    }
}
class tablet {
    int no;
    String marka;
    String model;
    double fiyat;
    int boyut;
    tablet onceki, sonraki;

    public tablet(int no, String marka, String model, double fiyat, int boyut) {
        this.no = no;
        this.marka = marka;
        this.model = model;
        this.fiyat = fiyat;
        this.boyut = boyut;
        this.onceki = null;
        this.sonraki = null;
}
}

