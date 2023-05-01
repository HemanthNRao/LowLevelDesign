package tictactoe;

import java.util.ArrayList;
import java.util.List;

class Pair
{
    int x, y;
    Pair(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}

public class Board
{
    int size;
    PlayerPiece[][] board;

    Board(int size)
    {
        this.size = size;
        this.board = new PlayerPiece[size][size];
    }

    public boolean addValue(int row, int col, PlayerPiece playerPiece)
    {
        if(board[row][col]!=null)
        {
            System.out.println("Cell is already filled, Try other cell");
            return false;
        }
        board[row][col] = playerPiece;
        return true;
    }

    public List<Pair> getFreeCells()
    {
        int i, j;
        List<Pair> freeCells = new ArrayList<>();
        for(i=0;i<size;i++)
        {
            for(j=0;j<size;j++)
            {
                if(board[i][j] == null)
                    freeCells.add(new Pair(i, j));
            }
        }
        return freeCells;
    }

    public boolean isThereAWinner(int row, int col, PlayerPiece playerPiece)
    {
        boolean isRowMatch, isColMatch, isDiagonalMatch, isRevDiagonalMatch;
        isColMatch = isDiagonalMatch = isRevDiagonalMatch = isRowMatch = true;

        int i, j;
        for(i=0;i<this.size;i++)
        {
            if(board[row][i] == null || board[row][i] != playerPiece)
            {
                isRowMatch = false;
                break;
            }
        }

        for(i=0;i<this.size;i++)
        {
            if(board[i][col] == null || board[i][col] != playerPiece)
            {
                isColMatch = false;
                break;
            }
        }

        for(i=0,j=0; i<this.size; i++,j++)
        {
            if(board[i][j] == null || board[i][j] != playerPiece)
            {
                isDiagonalMatch = false;
                break;
            }
        }

        for(i=0,j=size-1; i<this.size; i++,j--)
        {
            if(board[i][j] == null || board[i][j] != playerPiece)
            {
                isRevDiagonalMatch = false;
                break;
            }
        }

        return isColMatch || isRowMatch || isDiagonalMatch || isRevDiagonalMatch;
    }
}
