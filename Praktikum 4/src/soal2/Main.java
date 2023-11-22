package soal2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Pilih jenis hewan yang ingin diinputkan :");
        System.out.println("1 = Kucing");
        System.out.println("2 = Anjing");
        System.out.print("Masukkan pilihan : ");
        int pilihan = Input.nextInt();
        switch (pilihan) {
            case 1:
                System.out.print("Nama hewan peliharaan : ");
                String NK1 = Input.next();
                System.out.print("Ras : ");
                String RK1 = Input.next();
                System.out.print("Warna Bulu : ");
                String WK1 = Input.next();
                Kucing K1 = new Kucing(RK1, NK1, WK1);
                K1.displayDetailKucing();
                break;
            case 2:
                System.out.print("Nama hewan peliharaan : ");
                String NA1 = Input.next();
                System.out.print("Ras : ");
                String RA1 = Input.next();
                System.out.print("Warna Bulu : ");
                String WA1 = Input.next();
                System.out.print("Kemampuan : ");
                Input.nextLine();
                String[] kemampuan = Input.nextLine().split(", ");
                Anjing A1 = new Anjing(RA1, NA1, WA1, kemampuan);
                A1.displayDetailAnjing();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }
}