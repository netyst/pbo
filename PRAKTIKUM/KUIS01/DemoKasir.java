

public class DemoKasir {
    public static void main(String[] args) {
        Produk p1 = new Produk("PRDK01", "Pecel Lele", 21000);
        Produk p2 = new Produk("PRDK02", "Es Jeruk", 6000);
        Produk p3 = new Produk("PRDK03", "Sate Kambing", 16000);

        Transaksi transaksi1 = new Transaksi("09-09-2025");

        transaksi1.tambahItem(p1, 5);
        transaksi1.tambahItem(p2, 7);
        transaksi1.tambahItem(p3, 2);

        transaksi1.tampilNota();
    }
}
