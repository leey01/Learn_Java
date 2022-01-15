public class method {
    public static void main(String[] args) {
        cetakNama("Akbar", 15);

        genap();
        ganjil();
        System.out.println(cekSim(18));
        System.out.println("Keliling Persegi : " + kelilingPersegi(10));
    }


    public static void cetakNama(String nama, int usia) {
        System.out.println("my name is " + nama + ", i'm "+ usia + " years old");
    }

//    Latihan
//    Cek Bilangan genap ganjil

//    public static String cekBil(int angka) {
//        if (angka % 2 == 0) {
//            return "ini bilangan genap";
//        } else {
//            return "ini bilangan ganjil";
//        }
//    }

    public static void genap() {
        for(int i = 0; i < 10; i++) {
            if ( i % 2 == 0 ) {
                System.out.println("Bilangan " + i + " adalah genap");
            }
        }
    }

    public static void ganjil() {
        for(int i = 0; i < 10; i++) {
            if ( i % 2 == 1 ) {
                System.out.println("Bilangan " + i + " adalah ganjil");
            }
        }
    }

//    cek pengajuan sim
    public static String cekSim(int umur) {
        if ( umur >= 17 ) {
            return "Buat sim";
        } else {
            return "Belum buat sim";
        }
    }

//    hitung keliling sisi
    public static int kelilingPersegi(int sisi) {
        return sisi * 4;
    }

}
