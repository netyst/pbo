public class DemoKucing {
    public static void main(String[] args) {

        Kucing c1 = new Kucing();
        c1.nama = "Moku";
        c1.warnaBulu = "Hitam Putih";
        c1.ras = "Anggora";
        c1.umur = 2;
        c1.berat = 5.2;

        Kucing c2 = new Kucing();
        c2.nama = "Pipo";
        c2.warnaBulu = "Coklat Putih";
        c2.ras = "Persia";
        c2.umur = 4;
        c2.berat = 7.5;

// update nilai atribut c1
        c1.umur = 5;
        c1.berat = 6.2;

// update nilai atribut c2
        c2.umur = 7;
        c2.berat = 8.5;

        System.out.println("--- DATA KUCING 1 ---");
        System.out.println("Nama       : " + c1.nama);
        System.out.println("Warna Bulu : " + c1.warnaBulu);
        System.out.println("Ras        : " + c1.ras);
        System.out.println("Umur       : " + c1.umur + " Bulan");
        System.out.println("Berat      : " + c1.berat + " kg");
        c1.makan();
        c1.tidur();
        System.out.println("- " + c1.mengeong());
        c1.berlari();
        c1.bermain();
        System.out.println();

        System.out.println("--- DATA KUCING 2 ---");
        System.out.println("Nama       : " + c2.nama);
        System.out.println("Warna Bulu : " + c2.warnaBulu);
        System.out.println("Ras        : " + c2.ras);
        System.out.println("Umur       : " + c2.umur + " Bulan");
        System.out.println("Berat      : " + c2.berat + " kg");
        c2.makan();
        c2.tidur();
        System.out.println("- " + c2.mengeong());
        c2.berlari();
        c2.bermain();
    }
}
