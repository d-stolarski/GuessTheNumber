import java.util.Random;

public class GuessGame {

    private Player player1;
    private Player player2;
    private Player player3;

    public void startTheGame() {
        player1 = new Player();
        player2 = new Player();
        player3 = new Player();
        Random random = new Random();

        boolean isPlayerOneWin = false;
        boolean isPlayerTwoWin = false;
        boolean isPlayerThreeWin = false;

        int numberToGuess = random.nextInt(0,10);

        while (!isPlayerOneWin && !isPlayerTwoWin && !isPlayerThreeWin){
            System.out.println("Typing number to guess...");
            System.out.println("Number to guess is: " + numberToGuess);
            player1.setPlayerTypeNumber(player1.guessNumber());
            player2.setPlayerTypeNumber(player2.guessNumber());
            player3.setPlayerTypeNumber(player3.guessNumber());

            System.out.println("Player 1 is typing -> " + player1.getPlayerTypeNumber());
            System.out.println("Player 2 is typing -> " + player2.getPlayerTypeNumber());
            System.out.println("Player 3 is typing -> " + player3.getPlayerTypeNumber());

            if(player1.getPlayerTypeNumber() == numberToGuess) {
                System.out.println("Player 1 hit the correct number and win!");
                isPlayerOneWin = true;
            }
            if(player2.getPlayerTypeNumber() == numberToGuess) {
                System.out.println("Player 2 hit the correct number and win!");
                isPlayerTwoWin = true;
            }
            if(player3.getPlayerTypeNumber() == numberToGuess) {
                System.out.println("Player 3 hit the correct number and win!");
                isPlayerThreeWin = true;
            }

            if(!isPlayerOneWin && !isPlayerTwoWin && !isPlayerThreeWin) {
                System.out.println("Nobody win!");
            }
        }
    }
}
