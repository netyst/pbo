public class DemoPersegiPanjang {
    public static void main(String[] args) {
        PersegiPanjang pp1 = new PersegiPanjang();
        pp1.panjang = 20;
        pp1.lebar = 10;

        pp1.displayInfo();
        System.out.println("Keliling: " + pp1.getKelilingPersegiPanjang());
        System.out.println("Luas    : " + pp1.getLuasPersegiPanjang());
        }
}
