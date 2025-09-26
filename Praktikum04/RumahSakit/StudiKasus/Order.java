package StudiKasus;

public class Order {
    private int idOrder;
    private String tanggalOrder;
    private int totalOrder;
    private Kurir kurir;

    public Order(int idOrder, String tanggalOrder, int totalOrder, Kurir kurir) {
        this.idOrder = idOrder;
        this.tanggalOrder = tanggalOrder;
        this.totalOrder = totalOrder;
        this.kurir = kurir;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public String detailOrder() {
        return "Order ID: " + idOrder + " || Tanggal: " + tanggalOrder + " || Total: " + totalOrder + " || Nama Kurir: " + kurir.getNama();
    }
}
