import java.util.Scanner;
public class PRAK103_2210817310007_HafizhPratamaBudiman {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.print("");
        int X = myInput.nextInt();
        System.out.print("");
        int firstN = myInput.nextInt();
        int inRow = 1;
        do {
            if (firstN % 2 != 0) {
                System.out.print(" " + firstN);
                inRow++; }
            firstN++; }
        while (inRow <= X);
        myInput.close();; }
}
