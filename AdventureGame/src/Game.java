import java.util.Scanner;

public class Game {

    private Scanner input = new Scanner(System.in);

    public void start() {
        System.out.println("Welcome Adventurer!");
        System.out.println("Please write your name: ");
        String playerName = input.nextLine();

        Player player = new Player(playerName);
        System.out.println("Oyuncu " + player.getPlayerName() + " enjoy!");

        player.selectChar();

        player.selectLocation();
    }
}
