public class MahasiswaDemo {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        m1.nim = "0234312";
        m1.nama = "Yansy Ayuningtyas";
        m1.alamat = "Nias, Sumatra Utara";
        m1.kelas = "2A";

        Mahasiswa m2 = new Mahasiswa();
        m2.nim = "2222222";
        m2.nama = "Alexander Jonathan Wiratama";
        m2.alamat = "Malang";
        m2.kelas = "2C";

        Mahasiswa m3 = new Mahasiswa();
        m3.nim = "1111111";
        m3.nama = "Gabriella Aurelia Putri Pranata";
        m3.alamat = "Pasuruan";
        m3.kelas = "2Z";

        m1.displayBiodata();
        m2.displayBiodata();
        m3.displayBiodata();
    }
}