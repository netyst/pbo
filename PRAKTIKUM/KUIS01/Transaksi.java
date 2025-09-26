
import java.util.ArrayList;

public class Transaksi {
    private String tanggal;
    private ArrayList<ItemTransaksi> daftarItem;
    private double totalHarga;

    public Transaksi(String tanggal) {
        this.tanggal = tanggal;
        this.daftarItem = new ArrayList<>();
        this.totalHarga = 0;
    }

    public String getTanggal() {
        return tanggal;
    }

    public ArrayList<ItemTransaksi> getDaftarItem() {
        return daftarItem;
    }

    public void tambahItem(Produk p, int jumlah) {
        ItemTransaksi item = new ItemTransaksi(p, jumlah);
        daftarItem.add(item);
    }

    public double hitungTotal() {
        totalHarga = 0;
        for (ItemTransaksi item : daftarItem) {
            totalHarga += item.getSubtotal();
        }
        return totalHarga;
    }

    public void tampilNota() {
        System.out.println("=== NOTA PEMBELIAN ===");
        System.out.println("Tanggal         : " + tanggal);
        System.out.println("Daftar Belanja:");
        for (ItemTransaksi item : daftarItem) {
            System.out.println(item.getProduk().getNamaProduk() + " X" + item.getJumlah() + " = Rp " + item.getSubtotal());
        }
        System.out.println(".................................................");
        System.out.println("Total -----> Rp " + hitungTotal());
    }
}
