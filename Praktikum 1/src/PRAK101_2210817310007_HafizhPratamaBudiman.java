import java.util.Scanner;
public class PRAK101_2210817310007_HafizhPratamaBudiman {
    public static void main(String[] args){
        Scanner myInput = new Scanner(System.in);
        System.out.print("Masukkan Nama Lengkap : ");
        String name = myInput.nextLine();
        System.out.print("Masukkan Tempat Lahir : ");
        String bplc = myInput.nextLine();
        System.out.print("Masukkan Tanggal Lahir : ");
        int bdt = myInput.nextInt();
        System.out.print("Masukkan Bulan Lahir : ");
        int mnth = myInput.nextInt();
        System.out.print("Masukkan Tahun Lahir : ");
        int byr = myInput.nextInt();
        System.out.print("Masukkan Tinggi Badan : ");
        int hght = myInput.nextInt();
        System.out.print("Masukkan Berat Badan : ");
        float wght = myInput.nextFloat();

        String month;
        switch (mnth){
            case 1: month="Januari"; break;
            case 2: month="Februari"; break;
            case 3: month="Maret"; break;
            case 4: month="April"; break;
            case 5: month="Mei"; break;
            case 6: month="Juni"; break;
            case 7: month="Juli"; break;
            case 8: month="Agustus"; break;
            case 9: month="September"; break;
            case 10: month="Oktober"; break;
            case 11: month="November"; break;
            case 12: month="Desember"; break;
            default: month="Invalid"; break;
        }
        System.out.printf("Nama Lengkap %s, Lahir di %s pada tanggal %d %s %d \n",name,bplc,bdt,month,byr);
        System.out.printf("Tinggi Badan %d cm dan Berat Badan %.2f Kilogram",hght,wght);
    }
}
