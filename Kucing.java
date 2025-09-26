public class Kucing {
    public String nama, warnaBulu, ras;
    public int umur;
    public double berat;

    public void makan(){
        System.out.println("- Kucing ini sedang memakan makanannya di kandang.");
    }

    public void tidur(){
        System.out.println("- Setelah makan, kucing tersebut tidur dengan nyenyak.");
    }

    public String mengeong(){
        return "Suaranya meooong.";
    }

    public void berlari(){
        System.out.println("- Pada malam hari, kucing ini sangat aktif berlari diatap rumah.");
    }

    public void bermain(){
        System.out.println("- Lalu saat di sofa, kucing tersebut bermain ekornya sendiri.");
    }

}
