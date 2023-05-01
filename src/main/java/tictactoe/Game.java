package tictactoe;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Game
{
    long gameId;
    Deque<Player> players;
    Board gameBoard;
    Scanner scanner = new Scanner(System.in);

    Game()
    {
        initialize();
    }

    private void initialize()
    {
        this.gameBoard = new Board(3);
        this.gameId = 10;
        players = new LinkedList<>();
        PlayerPiece oPlayer = new PlayerPieceO();
        PlayerPiece xPlayer = new PlayerPieceX();
        Player player1 = new Player(1, oPlayer);
        Player player2 = new Player(2, xPlayer);
        players.add(player1);
        players.add(player2);
    }

    public String startGame()
    {
        boolean isWinnerFound = true;
        {
            while (isWinnerFound)
            {
                if(gameBoard.getFreeCells().size()==0)
                {
                    isWinnerFound = false;
                    continue;
                }

                Player playerTurn = players.poll();
                System.out.println("Input the cell");
                int row = scanner.nextInt();
                int col = scanner.nextInt();
                if(gameBoard.addValue(row, col, playerTurn.playerPiece))
                {
                    players.addLast(playerTurn);
                }
                else
                {
                    players.add(playerTurn);
                    continue;
                }
                if(gameBoard.isThereAWinner(row, col, playerTurn.playerPiece))
                {
                    return String.format("Player %s wins the game", playerTurn.id);
                }
            }
        }
        return "tie";
    }
}
