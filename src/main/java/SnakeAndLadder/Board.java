package SnakeAndLadder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board
{
    int size;
    Map<Integer, Integer> snakes;
    Map<Integer, Integer> ladders;
    List<Player> winners;

    public Board(int size)
    {
        this.size = size;
        this.snakes = new HashMap<>();
        this.ladders = new HashMap<>();
        this.winners = new ArrayList<>();
    }

    public boolean addLadder(int start, int end)
    {
        if(start>end)
        {
            System.out.println("Start should less than end for ladder");
            return false;
        }
        if(snakes.containsKey(start))
        {
            System.out.println("Same cell can't have both snake and ldder");
        }
        ladders.put(start, end);
        return true;
    }

    public boolean addSnake(int start, int end)
    {
        if(start<end)
        {
            System.out.println("Start should greater than end for ladder");
            return false;
        }
        if(ladders.containsKey(start))
        {
            System.out.println("Same cell can't have both snake and ladder");
        }
        ladders.put(start, end);
        return true;
    }

    public void movePan(Player player, int value)
    {
        if(player.isWinner)
        {
            System.out.println("Player is already won the match");
            return;
        }

        int temp = player.getPosition() + value;
        if(snakes.containsKey(temp))
        {
            temp = snakes.get(temp);
        }

        else if(ladders.containsKey(temp))
        {
            temp = ladders.get(temp);
        }

        player.setPosition(temp);
    }
}
