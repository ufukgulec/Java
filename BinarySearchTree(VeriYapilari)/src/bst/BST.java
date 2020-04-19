package bst;

import java.util.Stack;

public class BST {

    static Agac kok = null;

    Agac maxBul(Agac dugum) {

        while (dugum.sag != null) {
            dugum = dugum.sag;
        }
        return dugum;
    }

    Agac minBul(Agac dugum) {
        while (dugum.sol != null) {
            dugum = dugum.sol;
        }
        return dugum;
    }

    void sil(int veri) {

        if (kok.veri == veri) {
            kokSil();
            return;
        }

        Agac gecici = kok;
        Agac gecici2 = null;

        do {

            if (gecici.veri == veri) {
                if (gecici.sag == null && gecici.sol == null) {
                    yaprakSil(gecici2, veri);
                    return;
                } else if (gecici.sag == null && gecici.sol != null) {
                    sagDugumBosSil(gecici2, veri);
                    return;
                } else if (gecici.sag != null && gecici.sol == null) {
                    solDugumBosSil(gecici2, veri);
                    return;
                } else if (gecici.sol != null && gecici.sag != null) {
                    babaSilici_60(gecici, gecici2, veri);
                    return;
                }
            }

            gecici2 = gecici;

            if (veri < gecici.veri) {
                gecici = gecici.sol;
            } else {
                gecici = gecici.sag;
            }

        } while (gecici != null);

    }

    void yaprakSil(Agac gecici, int veri) {

        if (veri < gecici.veri) {
            gecici.sol = null;
        } else {
            gecici.sag = null;
        }
    }

    void kokSil() {
        Agac gecici = null;
        if (kok.sag != null) {
            gecici = minBul(kok.sag);
        } else {
            gecici = maxBul(kok.sol);
        }
        sil(gecici.veri);
        gecici.sol = kok.sol;
        gecici.sag = kok.sag;
        kok = gecici;
    }

    void sagDugumBosSil(Agac gecici, int veri) {
        if (veri < gecici.veri) {
            gecici.sol = gecici.sol.sol;
        } else {

            gecici.sag = gecici.sag.sol;
        }
    }

    void solDugumBosSil(Agac gecici, int veri) {
        if (veri < gecici.veri) {
            gecici.sol = gecici.sol.sag;
        } else {

            gecici.sag = gecici.sag.sag;
        }
    }

    void babaSilici_60(Agac gecici, Agac gecici2, int veri) {
        Agac gecici3 = maxBul(gecici.sol);
        sil(gecici3.veri);
        gecici3.sag = gecici.sag;
        gecici3.sol = gecici.sol;
        if (veri < gecici2.veri) {
            gecici2.sol = gecici3;
        } else {
            gecici2.sag = gecici3;
        }
    }

    void kokEkle(int veri) {
        Agac dugum = new Agac(veri);
        if (kok == null) {

            kok = dugum;
        } else {

            System.out.println("Ula neydiyisun?? Kök vardur zaten!");
            dugumEkle(veri);
        }
    }

    void dugumEkle(int veri) {
        Agac gecici = kok;
        Agac gecici2 = null;
        if (gecici == null) {
            kokEkle(veri);
        } else {
            while (gecici != null) {
                gecici2 = gecici;
                if (veri == gecici.veri) {
                    gecici.es = new Agac(veri);
                    return;
                } else if (veri < gecici.veri) {
                    gecici = gecici.sol;
                } else {
                    gecici = gecici.sag;
                }
            }

            if (veri < gecici2.veri) {
                gecici2.sol = new Agac(veri);
            } else if (veri > gecici2.veri) {
                gecici2.sag = new Agac(veri);
            }

        }
    }

    void preOrder(Agac nesne) {

        if (nesne == null) {
            return;
        }
        System.out.print(nesne.veri + " ");
        preOrder(nesne.sol);
        preOrder(nesne.sag);

    }

    void preOrderDongu() {
        if (kok == null) {
            return;
        }
        Stack<Agac> s = new Stack();
        Agac gecici = kok;
        s.push(gecici);
        while (!s.isEmpty()) {
            gecici = s.pop();
            System.out.print(gecici.veri + " ");

            if (gecici.sag != null) {
                s.push(gecici.sag);
            }
            if (gecici.sol != null) {
                s.push(gecici.sol);
            }
        }
    }

    void postOrder(Agac nesne) {

        if (nesne == null) {
            return;
        }
        postOrder(nesne.sol);
        postOrder(nesne.sag);
        System.out.print(nesne.veri + " ");

    }

    void postOrderDongu() {
        if (kok == null) {
            return;
        }

        Stack<Agac> s1 = new Stack();
        Stack<Agac> s2 = new Stack();
        Agac gecici = kok;
        s1.push(gecici);
        while (!s1.isEmpty()) {
            gecici = s1.pop();
            s2.push(gecici);

            if (gecici.sol != null) {
                s1.push(gecici.sol);
            }
            if (gecici.sag != null) {
                s1.push(gecici.sag);
            }
        }
        while (!s2.isEmpty()) {
            gecici = s2.pop();
            System.out.print(gecici.veri + " ");
        }

    }

    void inOrder(Agac nesne) {

        if (nesne == null) {
            return;
        }
        inOrder(nesne.sol);
        System.out.print(nesne.veri + " ");
        inOrder(nesne.sag);

    }

    void inOrderDongu() {
        if (kok == null) {
            return;
        }
        Stack<Agac> s = new Stack();
        Agac gecici = kok;
        while (gecici != null || s.size() > 0) {
            while (gecici != null) {
                s.push(gecici);
                gecici = gecici.sol;
            }

            gecici = s.pop();
            System.out.print(gecici.veri + " ");
            gecici = gecici.sag;
        }
    }

    void yazdir(Agac kok) {
        System.out.println("PreOrder");
        preOrderDongu();
        System.out.println("\n");
        System.out.println("PostOrder");
        postOrderDongu();
        System.out.println("\n");
        System.out.println("InOrder");
        inOrderDongu();
        System.out.println("\n");
    }

    public static void main(String[] args) {

        BST agac = new BST();
        agac.kokEkle(7);
        agac.dugumEkle(11);
        agac.dugumEkle(15);
        agac.dugumEkle(16);
        agac.dugumEkle(12);
        agac.dugumEkle(9);
        agac.dugumEkle(8);
        agac.dugumEkle(4);
        agac.dugumEkle(5);
        agac.dugumEkle(6);
        agac.dugumEkle(1);
        agac.dugumEkle(3);
        agac.dugumEkle(2);
        agac.dugumEkle(0);

        agac.sil(4);

        agac.yazdir(kok);

    }

}
