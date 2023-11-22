package soal1;
import java.util.Scanner;
public class HewanPeliharaan {
    Scanner usrInput = new Scanner(System.in);
    private String nama, ras;
    public HewanPeliharaan(String n, String r){
        this.nama = n;
        this.ras = r;
    }
    public void display(){
        System.out.print("Nama Hewan Peliharaan : ");
        nama = usrInput.nextLine();
        System.out.print("Ras : ");
        ras = usrInput.nextLine();
        System.out.println("Detail Hewan Peliharaan : ");
        System.out.println("Nama Hewan Peliharaanku adalah : "+ nama);
        System.out.println("Dengan Ras : "+ras);
    }
}