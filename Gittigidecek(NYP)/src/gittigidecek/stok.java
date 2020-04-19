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
public class stok {

    tvler tv = new tvler();
    pcler pc = new pcler();
    teller tel = new teller();
    tabletler tab = new tabletler();

    siparis ilk = null, son = null;

    public void siparis(int sno, int urunno) {
        siparis s = new siparis(sno,urunno);
        if (ilk == null) {
            ilk = s;
            son = s;

        } else {
            son.sonraki = s;
            s.onceki = son;
            son = s;

        }
        
    }

    public void listele() {
        siparis gecici = ilk;
        while (gecici != null) {
            System.out.println("Sipariş No: " + gecici.sıparısno + " Ürün No: " + gecici.urunno);
            gecici = gecici.sonraki;

        }

    }

}

class siparis {

    int sıparısno;
    int urunno;
    
    siparis onceki, sonraki;

    public siparis(int sno, int urunno) {
        this.sıparısno = sno;
        this.urunno = urunno;
        this.onceki = null;
        this.sonraki = null;
    }

}
