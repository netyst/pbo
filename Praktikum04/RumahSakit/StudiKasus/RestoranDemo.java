package StudiKasus;

public class RestoranDemo {
    public static void main(String[] args) {

        Kurir kurir1 = new Kurir(111, "Andi", "Motor");
        Kurir kurir2 = new Kurir(222, "Budi", "Mobil");

        Restoran resto = new Restoran(123, "Restoran Kita", "Jalan Bahagia No.01");

        Order order1 = new Order(1001, "2025-09-25", 500000, kurir1);
        Order order2 = new Order(1002, "2025-09-26", 750000, kurir2);

        resto.tambahOrder(order1);
        resto.tambahOrder(order2);

        kurir1.tambahOrder(order1);
        kurir2.tambahOrder(order2);

        resto.tampilkanOrder();
        kurir1.tampilkanOrder();
        kurir2.tampilkanOrder();

        System.out.println("--------> Menghapus order dengan ID 1001 <--------\n");
        resto.hapusOrder(1001);
        kurir1.hapusOrder(1001);

        resto.tampilkanOrder();
        kurir1.tampilkanOrder();
        kurir2.tampilkanOrder();
    }
}
