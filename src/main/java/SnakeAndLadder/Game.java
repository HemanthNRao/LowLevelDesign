package SnakeAndLadder;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Game
{
    Dice dice;
    Board board;
    Deque<Player> players = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);

    public void initilize()
    {
        System.out.println("Initilize board size");
        int size = scanner.nextInt();
        board = new Board(size);

        System.out.println("Input number of dice");
        int numberOfDice = scanner.nextInt();
        System.out.println("Input dice shape");
        int diceShape = scanner.nextInt();
        dice = new Dice(numberOfDice, diceShape);

        addLadders();
        addSnakes();


    }

    private void createPlayers()
    {
        System.out.println("Enter number of players");
    }
    private void addSnakes()
    {
        int numberOfSnakes = scanner.nextInt();
        while (numberOfSnakes>0)
        {
            System.out.println("Pls provide start and end point for snake");
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            if(board.addSnake(start, end))
            {
                numberOfSnakes--;
                System.out.println("Snaked added successfully");
            }
            else
            {
                System.out.println("Pls provide different output");
            }
        }
    }

    private void addLadders()
    {
        int numberOfSnakes = scanner.nextInt();
        while (numberOfSnakes>0)
        {
            System.out.println("Pls provide start and end point for ladder");
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            if(board.addSnake(start, end))
            {
                numberOfSnakes--;
                System.out.println("Ladder added successfully");
            }
            else
            {
                System.out.println("Pls provide different output");
            }
        }
    }
}
