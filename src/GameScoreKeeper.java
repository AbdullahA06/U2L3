public class GameScoreKeeper {
    private int players;
    private int score;
    private boolean gameOver;

    public GameScoreKeeper(int players) {
        this.players = players;
        score = 0;
        gameOver = false;
    }

    public int getPlayers() {
        return players;
    }

    public void end() {
        gameOver = true;
    }
}

