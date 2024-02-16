/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tic_tac;
import java.util.Scanner;

/**
 *
 * @author amrinder
 */
public class TicTacToeGame {

    /**
     * author @Amrinder  
     * editor Gurkirat 
     * and lovish 
     * date- 16/2/2024
     */

    public static void main(String[] args) {
        TicTacToeGame game = new TicTacToeGame();
        game.playGame();
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        Board board = new Board();
        Player playerX = new Player("Player X");
        Player playerO = new Player("Player O");
        Player currentPlayer = playerX;

        while (!board.isGameOver()) {
            board.displayBoard();
            System.out.println(currentPlayer.getName() + ", enter your move (1-9): ");
            int move = scanner.nextInt();

            while (!board.isValidMove(move)) {
                System.out.println("Invalid move. Try again: ");
                move = scanner.nextInt();
            }

            board.makeMove(currentPlayer.getSymbol(), move);
            if (board.checkForWinner()) {
                board.displayBoard();
                System.out.println(currentPlayer.getName() + " wins!");
                return;
            }

            currentPlayer = (currentPlayer == playerX) ? playerO : playerX;
        }

        board.displayBoard();
        System.out.println("It's a draw!");
    }
}
    
    

