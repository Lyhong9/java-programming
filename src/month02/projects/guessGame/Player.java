package month02.projects.guessGame;

public class Player {
    private int playerNumber;

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        if (playerNumber >= 0 && playerNumber < 10) {
            this.playerNumber = playerNumber;
        }else  {
            System.out.println("Invalid player number!");
        }
    }
}
