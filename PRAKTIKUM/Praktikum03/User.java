package Praktikum03;

public class User {
    private String username;
    private String nama;
    private String email;
    private String alamat;
    private String pekerjaan;

    public User(String username, String nama, String email, String alamat, String pekerjaan) {
        this.username = username;
        this.nama = nama;
        this.email = email;
        this.alamat = alamat;
        this.pekerjaan = pekerjaan;
    }

    public void cetakInfo() {
        System.out.println("Username: " + username);
        System.out.println("Nama    : " + nama);
        System.out.println("Email   : " + email);
        System.out.println("Alamat  : " + alamat);
        System.out.println("Pekerjaan: " + pekerjaan);
        System.out.println("======================");
    }
}



