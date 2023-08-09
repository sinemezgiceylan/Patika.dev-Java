import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> teams = new ArrayList<>();
        teams.add("Fenerbahçe");
        teams.add("Galatasaray");
        teams.add("Beşiktaş");
        teams.add("Trabzonspor");
        teams.add("Başakşehir");
        teams.add("Boluspor");
        teams.add("Bursaspor");

        TeamFixtureGenerator fixtureGenerator = new TeamFixtureGenerator(teams);
        List<String> fixtures = fixtureGenerator.getFixtures();

        int round = 1;
        for (String fixture : fixtures) {
            System.out.println("Round " + round);
            System.out.println(fixture);
            round++;
        }
    }
}