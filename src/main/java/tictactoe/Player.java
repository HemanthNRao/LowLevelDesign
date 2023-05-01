package tictactoe;

public class Player
{
    long id;
    String playerName;
    int playerRank;
    PlayerPiece playerPiece;

    Player(long id, PlayerPiece playerPiece)
    {
        this.id = id;
        this.playerPiece = playerPiece;
    }


    public String getPlayerName()
    {
        return this.playerName;
    }

    public int getPlayerRank()
    {
        return playerRank;
    }
}
