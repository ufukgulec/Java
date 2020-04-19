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
public class musteriler {

    stok s = new stok();
    musteri ilk = null, son = null;

    public void ekle(int no, double borc, String isim, String soyisim) {
        musteri m = new musteri(no,borc, isim, soyisim);
        if (ilk == null) {
            ilk = m;
            son = m;

        } else {
            son.sonraki = m;
            m.onceki = son;
            son = m;

        }
    }

    public void listele() {
        musteri gecici = ilk;
        while (gecici != null) {
            System.out.println("Müsteri No: " + gecici.no + " Müsteri Adı Soyadı: " + gecici.isim + " " + gecici.soyisim);
            gecici = gecici.sonraki;
        }

    }
}

class musteri {

    int no;
    double borc;
    String isim;
    String soyisim;
    musteri onceki, sonraki;

    public musteri(int no,double borc, String isim, String soyisim) {
        this.no = no;
        this.borc=borc;
        this.isim = isim;
        this.soyisim = soyisim;
        this.onceki = null;
        this.sonraki = null;
    }

}
