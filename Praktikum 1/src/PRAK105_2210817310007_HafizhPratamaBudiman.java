import java.util.Scanner;
public class PRAK105_2210817310007_HafizhPratamaBudiman {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        final double PHI = 3.14;
        System.out.print("Masukkan jari-jari tabung: ");
        double jariJari = myInput.nextDouble();
        System.out.print("Masukkan tinggi tabung: ");
        double tinggi = myInput.nextDouble();
        double volumeM3 = (PHI * Math.pow(jariJari / 100, 2) * tinggi / 100) * 1000000;
        System.out.printf("Volume tabung dengan jari-jari %.1f cm dan tinggi %.1f cm adalah %.3f m3%n", jariJari, tinggi, volumeM3);
                myInput.close();
    }
}
