package StudiKasus;
import java.util.ArrayList;

public class Restoran {
    private int idRestoran;
    private String namaRestoran;
    private String alamatRestoran;
    private ArrayList<Order> daftarOrder;

    public Restoran (int idRestoran, String namaRestoran, String alamatRestoran){
        this.idRestoran = idRestoran;
        this.namaRestoran = namaRestoran;
        this.alamatRestoran = alamatRestoran;
        this.daftarOrder = new ArrayList<>();
    }

    public void tambahOrder (Order order) {
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
        System.out.println("=== DATA RESTORAN ===");
        System.out.println("ID       : " + idRestoran);
        System.out.println("Nama     : " + namaRestoran);
        System.out.println("Alamat   : " + alamatRestoran);

        if (daftarOrder.isEmpty()) {
            System.out.println("Belum ada order.");
        } else {
            System.out.println("Daftar order:");
            for (Order order : daftarOrder) {
                System.out.println("  " + order.detailOrder());
            }
        }
        System.out.println();
    }
}
