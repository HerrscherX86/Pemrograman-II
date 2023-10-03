import java.util.Scanner;
public class PRAK104_2210817310007_HafizhPratamaBudiman {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.print("Tangan Abu: ");
        String abuR1 = myInput.next().toUpperCase();
        String abuR2 = myInput.next().toUpperCase();
        String abuR3 = myInput.next().toUpperCase();
        System.out.print("Tangan Bagas: ");
        String bagasR1 = myInput.next().toUpperCase();
        String bagasR2 = myInput.next().toUpperCase();
        String bagasR3 = myInput.next().toUpperCase();
        int poinAbu = 0;
        int poinBagas = 0;
        if (abuR1.equals("B") && bagasR1.equals("G") ||
                abuR1.equals("G") && bagasR1.equals("K") ||
                abuR1.equals("K") && bagasR1.equals("B")) {
            poinAbu++; }
        else if (bagasR1.equals("B") && abuR1.equals("G") ||
                bagasR1.equals("G") && abuR1.equals("K") ||
                bagasR1.equals("K") && abuR1.equals("B")) {
            poinBagas++; }
        if (abuR2.equals("B") && bagasR2.equals("G") ||
                abuR2.equals("G") && bagasR2.equals("K") ||
                abuR2.equals("K") && bagasR2.equals("B")) {
            poinAbu++;
        } else if (bagasR2.equals("B") && abuR2.equals("G") ||
                bagasR2.equals("G") && abuR2.equals("K") ||
                bagasR2.equals("K") && abuR2.equals("B")) {
            poinBagas++; }
        if (abuR3.equals("B") && bagasR3.equals("G") ||
                abuR3.equals("G") && bagasR3.equals("K") ||
                abuR3.equals("K") && bagasR3.equals("B")) {
            poinAbu++;
        } else if (bagasR3.equals("B") && abuR3.equals("G") ||
                bagasR3.equals("G") && abuR3.equals("K") ||
                bagasR3.equals("K") && abuR3.equals("B")) {
            poinBagas++; }
        if (poinAbu > poinBagas) {
            System.out.println("Pemenang: Abu"); }
        else if (poinBagas > poinAbu) {
            System.out.println("Pemenang: Bagas"); }
        else {
            System.out.println("Hasil: Seri"); }
        myInput.close(); }
}