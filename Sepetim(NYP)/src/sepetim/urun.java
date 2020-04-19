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
class urun {

    int id;
    String marka;
    double fiyat;
    urun next, prev;

    public urun(int id, String marka, double fiyat) {
        this.id = id;
        this.marka = marka;
        this.fiyat = fiyat;
        this.next = null;
        this.prev = null;
    }

}
