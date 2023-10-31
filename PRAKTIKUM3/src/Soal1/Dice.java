package Soal1;
import java.util.Random;
public class Dice {
    private int Value;
    public void shuffleValue() {
        Random rdmVal = new Random();
        Value = rdmVal.nextInt(6)+1;
    }
    public int getValue() {
        return Value;
    }
}

