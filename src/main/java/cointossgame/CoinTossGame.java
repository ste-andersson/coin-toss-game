package cointossgame;

import java.util.Scanner;

public class CoinTossGame {

    public static void main(String[] args) {
        System.out.println("What is your name, player 1?");
        Scanner scanner = new Scanner(System.in);
        Player player1 = new Player(scanner.nextLine());
        System.out.println("Name of player 1 is now set to " + player1.getName() + ".");
        System.out.println("What is your name, player 2?");
        Player player2 = new Player(scanner.nextLine());
        System.out.println("Name of player 2 is now set to " + player2.getName() + ".");
        System.out.println(player1.getName() + ", make a guess! Heads or tails?");
        player1.setGuess(scanner.nextLine().toUpperCase());
        while(!player1.getGuess().equals(Coin.HEADS) && !player1.getGuess().equals(Coin.TAILS)) {
            System.out.println(player1.getName() + ", you must pick " + Coin.HEADS + " or " + Coin.TAILS + "!");
            player1.setGuess(scanner.nextLine().toUpperCase());
        }
        if (player1.getGuess().equals(Coin.HEADS)){
            player2.setGuess(Coin.TAILS);
        } else {
            player2.setGuess(Coin.HEADS);
        }
        System.out.println(player1.getName() + ", you selected " + player1.getGuess() + ".");
        System.out.println(player2.getName() + ", that means you get " + player2.getGuess() + ".");
        Coin coin = new Coin();
        coin.flip();
        System.out.println("It's " + coin.getSide() + "!");

        if(coin.getSide().equals(player1.getGuess())){
            System.out.println(player1.getName().toUpperCase() + " WINS!!!");
        } else {
            System.out.println(player2.getName().toUpperCase() + " WINS!!!");
        }
        scanner.close();
    }
}
