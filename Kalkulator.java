import java.util.Scanner;

public class Kalkulator{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = input.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();

        double hasil = hitung(angka1, angka2, operator);

        System.out.println("Hasil: " + angka1 + " " + operator + " " + angka2 + " = " + hasil);

        input.close();
    }

    public static double hitung(double a, double b, char op) {
        double hasil = 0;
        switch (op) {
            case '+':
                hasil = a + b;
                break;
            case '-':
                hasil = a - b;
                break;
            case '*':
                hasil = a * b;
                break;
            case '/':
                if (b != 0) {
                    hasil = a / b;
                } else {
                    System.out.println("ERROR!");
                }
                break;
            default:
                System.out.println("Tidak Valid!");
        }
        return hasil;
    }
}
