package Soal1;
import java.util.LinkedList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        LinkedList <Dice> diceList = new LinkedList<>();
        int diceTotal = myInput.nextInt();

        for (int x = 0; x<diceTotal; x++) {
            Dice Dadu = new Dice();
            Dadu.shuffleValue();
            diceList.add(Dadu);
        }
        int totalValue = 0;
        for (int x=0; x<diceList.size(); x++) {
            Dice Dadu = diceList.get(x);
            int Value = Dadu.getValue();
            System.out.println("Dadu ke-" + (x+1) + " bernilai " + Value);
            totalValue += Value;
        }
        System.out.println("Total nilai dadu keseluruhan " + totalValue);
    }
}
