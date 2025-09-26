package StudiKasus;
import java.util.ArrayList;

public class Kurir {
    private int idKurir;
    private String nama;
    private String namaKendaraan;
    private ArrayList<Order> daftarOrder;

    public Kurir(int idKurir, String nama, String namaKendaraan) {
        this.idKurir = idKurir;
        this.nama = nama;
        this.namaKendaraan = namaKendaraan;
        this.daftarOrder = new ArrayList<>();
    }

    public String getNama() {
        return nama;
    }

    public void tambahOrder(Order order) {
        daftarOrder.add(order);
    }

    public void hapusOrder(int id) {
        for (int i = 0; i < daftarOrder.size(); i++) {
            if (daftarOrder.get(i).getIdOrder() == id) {
                daftarOrder.remove(i);
                break;
            }
        }
    }

    public void tampilkanOrder() {
        System.out.println("=== DATA KURIR ===");
        System.out.println("ID        : " + idKurir);
        System.out.println("Nama      : " + nama);
        System.out.println("Kendaraan : " + namaKendaraan);

        if (daftarOrder.isEmpty()) {
            System.out.println("Belum ada order untuk kurir ini.");
        } else {
            System.out.println("Daftar order kurir:");
            for (Order order : daftarOrder) {
                System.out.println("  " + order.detailOrder());
            }
        }
        System.out.println();
    }
}
