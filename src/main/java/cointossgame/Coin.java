package cointossgame;

import java.util.Random;

public class Coin {
    private String side;
    private static final String HEADS = "HEADS";
    private static final String TAILS = "TAILS";
    private static Random random = new Random();

    public String getSide() {
        return side;
    }

    private void setSide(String side) {
        this.side = side;
    }

    public String flip() {
        if(random.nextBoolean()){
            side = HEADS;
        } else {
            side = TAILS;
        }
        return side;
    }
}
