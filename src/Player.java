import java.util.Random;

public class Player {

    private int playerTypeNumber;

    public void setPlayerTypeNumber(int playerTypeNumber) {
        this.playerTypeNumber = playerTypeNumber;
    }

    public int getPlayerTypeNumber() {
        return this.playerTypeNumber;
    }

    public int guessNumber() {
        Random random = new Random();
        return random.nextInt(0, 10);
    }
}
