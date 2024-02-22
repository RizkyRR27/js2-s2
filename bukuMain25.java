import java.util.Scanner;
public class bukuMain25 {
    
    String judul, pengarang;
    int halaman,stok,harga;

     void tampilInformasi(){
        System.out.println("judul :" + judul);
        System.out.println("pengarang :" + pengarang);
        System.out.println("jumlah halaman :" + halaman);
        System.out.println("sisa stok :" + stok);
        System.out.println("harga :" + harga);
    }
    void terjual (int jml){
        stok -= jml;
    }
    void restock (int jml){
          stok += jml;
    }
    void gantiHarga (int hrg){
        harga = hrg;
    }
    public static void main(String[] args) {
        
        bukuMain25 bk1 = new bukuMain25();
        bk1.judul="today ends tomorrow comes";
        bk1.pengarang = "Denanda Pertiwi";
        bk1.halaman= 198;
        bk1.stok = 13;
        bk1.harga =  71000;
        
        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();
        
        buku25 bk2 = new buku25 ("self Reward", "maheera ayesha",160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();
    }
}
