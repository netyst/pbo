

public class DemoReservasi {
    public static void main(String[] args) {
        Ruangan r1 = new Ruangan("RU01", "LPY 4", 30, true);
        Reservasi reservasi1 = new Reservasi("26-09-2025", 2, r1);

        Mahasiswa m1 = new Mahasiswa("244107060001", "CACA");
        Mahasiswa m2 = new Mahasiswa("244107060002", "DODO");
        Mahasiswa m3 = new Mahasiswa("244107060003", "FEFE");

        reservasi1.tambahMahasiswa(m1);
        reservasi1.tambahMahasiswa(m2);
        reservasi1.tambahMahasiswa(m3);

        reservasi1.tampilReservasi();
    }
}
