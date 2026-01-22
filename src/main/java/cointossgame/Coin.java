package cointossgame;

import java.util.Random;

public class Coin {
    private String side;
    public static final String HEADS = "HEADS";
    public static final String TAILS = "TAILS";
    private static Random random = new Random();

    public String getSide() {
        return side;
    }

    private void setSide(String side) {
        this.side = side;
    }

    public String getHeads() {
        return HEADS;
    }

    public String getTails() {
        return TAILS;
    }

    public void flip() {
        if(random.nextBoolean()){
            side = HEADS;
        } else {
            side = TAILS;
        }
    }

}
