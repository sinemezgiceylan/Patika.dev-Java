import java.util.Scanner;

public abstract class Location {

    private Player player;
    private String name;
    private int id;

    private final int howManyBattleLoc = 3;
    public static Scanner scan = new Scanner(System.in);

    public Location(Player player, String name, int id) {
        setPlayer(player);
        setName(name);
        setId(id);
    }

    abstract boolean onLocation();

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHowManyBattleLoc() {
        return howManyBattleLoc;
    }
}
