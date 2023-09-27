import java.util.Scanner;
public class PRAK005_2210817310007_HafizhPratamaBudiman {
    public static void main(String []args){

        Scanner myInput = new Scanner(System.in);
        System.out.print("Masukan Makanan Favorit: ");
        String makanan = myInput.nextLine();
        System.out.print("Masukan Hobi: ");
        String hobi = myInput.nextLine();

        System.out.printf("Aku Suka Makan %s, dan Hobiku %s",makanan,hobi);
    }
}
