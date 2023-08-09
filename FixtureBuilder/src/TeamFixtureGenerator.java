import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class TeamFixtureGenerator {

    private List<String> teams;
    private List<String> fixtures;

    public TeamFixtureGenerator(List<String> teams) {
        this.teams = new ArrayList<>(teams);
        this.fixtures = new ArrayList<>();
        generateFixtures();
    }

    public void generateFixtures() {
        if (teams.size() % 2 == 1) {
            teams.add("Bay");
        }

        int totalWeeks = teams.size() - 1;
        int matchesPerWeek = teams.size() / 2;

        for (int week = 0; week < totalWeeks; week++) {
            Collections.shuffle(teams, new Random(week));
                for (int match = 0; match < matchesPerWeek; match++) {
                    String homeTeam = teams.get(match);
                    String awayTeam = teams.get(matchesPerWeek + match);
                    fixtures.add(homeTeam + " vs " + awayTeam);
                }
        }
    }

    public List<String> getFixtures() {
        return fixtures;

    }
}
