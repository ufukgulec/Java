/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obs;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Ufuk
 */
public class liste1 {

    ögrenci ilk = null, son = null;
    ögrenci temp = null;
    int ogrencisayisi = 0;

    public void ekle(int no, int not, String ad, String soyad) {
        ögrenci o = new ögrenci(no, not, ad, soyad);

        if (ilk == null) {
            ilk = o;
            son = o;
            ogrencisayisi++;
        }else if(ilk==son && ilk.no<o.no){
            son.next = o;
            o.prev = son;
            son = o;
        }
        else if (ilk != null && ilk.no > o.no) {
            o.next = ilk;
            ilk.prev = o;
            ilk = o;
        }ögrenci gecici = ilk;
        if(ilk!=o && son!=o && gecici.next!=null && ilk!=son){
        
        while (gecici.next != null && gecici.next.no < o.no) {
            gecici = gecici.next;
        }
        o.next = gecici.next;
        gecici.next = o;}

//            son.next = o;
//            o.prev = son;
//            son = o;
//            ogrencisayisi++;
//        temp.next=gecici.next;
//        gecici.next=temp;
//        temp.no=o.no;
    }

//    public void sirala() {
//        ögrenci gecici=ilk;
//        int kucuk=0;
//        int buyuk=0;
//        while(gecici!=null){
//            if(kucuk<gecici.no){
//                kucuk=gecici.no;
//                buyuk=gecici.next.no;
//                gecici=gecici.next;
//            }else if(){
//            
//            }
//            
//            
//        gecici=gecici.next;
//        }
//       
//    }
    public void listele() throws IOException {
        ögrenci gecici = ilk;
        File f = new File("cikti.txt");//obs dosyasının içinde text dosyası oluşturuyor......
        FileWriter fw = new FileWriter("cikti.txt");
        while (gecici != null) {
            System.out.println(gecici.no + " " + gecici.ad + " " + gecici.soyad + " " + gecici.not);
            fw.write("Öğrenci no: " + gecici.no + " Öğrenci Adı Soyadı: " + gecici.ad + " " + gecici.soyad + " Notu: " + gecici.not + "\n");
            gecici = gecici.next;
        }
        fw.close();//txt dosyasını kapatır....

    }

    public void sil(int no) {
        ögrenci gecici = ilk;
        while (gecici != null) {
            if (gecici.no == no) {
                break;
            }
            gecici = gecici.next;
        }
        if (gecici == null) {
            System.out.println("Öğrenci bulunamadı...");
        } else {
            if (gecici == ilk) {
                if (ilk == son) {
                    ilk = null;
                    son = null;
                } else {
                    ilk = gecici.next;
                    ilk.prev = null;
                }
            } else {
                if (gecici == son) {
                    gecici.prev.next = null;
                    son = gecici.prev;
                } else {
                    gecici.prev.next = gecici.next;
                    gecici.next.prev = gecici.prev;
                }
            }
        }
    }
}

class ögrenci {

    int no;
    String ad;
    String soyad;
    int not;
    ögrenci next, prev;
    int ogrencisayisi = 0;

    public ögrenci(int no, int not, String ad, String soyad) {
        this.no = no;
        this.ad = ad;
        this.soyad = soyad;
        this.not = not;
        this.next = null;
        this.prev = null;
        ogrencisayisi++;
    }

    void sıralama() {
    }

}
