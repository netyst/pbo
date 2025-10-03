

public class Dosen extends Pegawai {
    public String nidn;
    
    public Dosen(String nip, String nama, double gaji, String nidn) {
        this.nip = nip;
        this.nama = nama;
        this.gaji = gaji;
        this.nidn = nidn;
        System.out.println("Objek dari class Dosen dibuat dengan konstruktor berparameter");
    }

    public String getInfo(){
        return "NIDN    : " + this.nidn + "\n";
    }

    public String getAllInfo(){
        String info = super.getInfo();
        info += this.getInfo();

        return info;
    }
}
