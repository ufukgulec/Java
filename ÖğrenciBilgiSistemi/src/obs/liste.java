/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obs;

/**
 *
 * @author Ufuk
 */
public class liste {

    ogrenci ilk = null, son = null;

    public void ekle(int no, int not, String ad, String soyad) {
        ogrenci o = new ogrenci(no, not, ad, soyad);
        if (ilk == null) {
            ilk = o;
            son = o;
        
        } else {
            
            son.next = o;
            son = o;
        }
    }

    public void listele() {
        System.out.println("---------------");
        System.out.println("öğrenci no--Ad soyad--Notu");
        ogrenci gecici = ilk;
        while (gecici != null) {
            System.out.println(gecici.no + "--" + gecici.ad + " " + gecici.soyad + "--" + gecici.not);
            gecici = gecici.next;
        }
    }

    public void sil(int no) {
        ogrenci gecici = ilk, bironceki = ilk;
        while (gecici != null) {
            if (gecici.no == no) {
                break;
            }
            bironceki = gecici;
            gecici = gecici.next;
        }
        if (gecici == null) {
            System.out.println("silmek istediğiniz öğrenci bulunamadı");
        }
        {
            if (ilk == son) {
                ilk = null;
                son = null;
            } else {
                if (gecici == ilk) {
                    ilk = gecici.next;
                } else {
                    if (gecici == son) {
                        son = bironceki;
                        bironceki.next=null;
                    } else {
                        bironceki.next = gecici.next;
                    }
                }
            }
        }
    }
}

class ogrenci {

    int no, not;
    String ad, soyad;
    ogrenci next;

    public ogrenci(int no, int not, String ad, String soyad) {
        this.no = no;
        this.not = not;
        this.ad = ad;
        this.soyad = soyad;
        this.next = null;
    }
}

