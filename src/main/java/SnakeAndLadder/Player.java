package SnakeAndLadder;


public class Player
{
    String id;
    int position;
    boolean isWinner;

    public Player(String id, int position, boolean isWinner)
    {
        this.id = id;
        this.position = position;
        this.isWinner = isWinner;
    }

    public String getId()
    {
        return id;
    }

    public void setPosition(int position)
    {
        this.position = position;
    }

    public int getPosition()
    {
        return position;
    }

    public boolean isWinner()
    {
        return isWinner;
    }
}
