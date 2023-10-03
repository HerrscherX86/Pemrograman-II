import java.util.Scanner;
public class PRAK102_2210817310007_HafizhPratamaBudiman {
    public static void main(String args[]){
        Scanner myInput = new Scanner(System.in);
        System.out.print(" ");
        int firstN = myInput.nextInt();
        int inRow = 1;
        while (inRow <= 11) {
            int hasil = firstN;
            if (firstN % 5 == 0) {
                hasil = firstN / 5 - 1; }
            System.out.print( " " + hasil);
            firstN++;
            inRow++; }
        myInput.close(); }
}