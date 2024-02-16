/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tic_tac;

/**
 *
 * @author amrinder
 * editor lovish
 */
public class Player
{
    private String name;
    private char symbol;

    public Player(String name) {
        this.name = name;
        this.symbol = (name.equals("Player X")) ? 'X' : 'O';
    }

    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }
}