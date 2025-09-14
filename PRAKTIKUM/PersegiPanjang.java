public class PersegiPanjang {
    public int panjang, lebar;

    public void displayInfo(){
        System.out.println("Panjang : " + panjang);
        System.out.println("Lebar   : " + lebar);
    }

    public int getLuasPersegiPanjang(){
        return panjang * lebar;
    }

    public int getKelilingPersegiPanjang(){
        return 2 * ( panjang + lebar);
    }
}
