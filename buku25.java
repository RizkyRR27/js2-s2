import java.util.Scanner;

public class buku25 {

        Scanner haha = new Scanner(System.in);

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
        public buku25 (String jud, String pg, int hal, int stok, int har) {
            judul = jud;
            pengarang= pg;
            halaman = hal;
            this.stok = stok;
            harga = har;
        }
    }


