package SnakeAndLadder;

import java.util.Random;

public class Dice
{
    int numberOfDice;
    int diceShape;
    Dice(int numberOfDice, int diceShape)
    {
        this.numberOfDice = numberOfDice;
        this.diceShape = diceShape;
    }

    public int spinDice()
    {
        Random random = new Random();
        int count = 0;
        for(int i=1;i<=numberOfDice;i++)
        {
            // Bound value is inclusive 0 and exclusive the given bound
            int val = random.nextInt(diceShape)+1;
            count += val;
        }
        return count;
    }
}
