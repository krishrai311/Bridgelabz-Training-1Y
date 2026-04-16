package Scenraio;
import java.util.*;

class Player {
    String name;

    Player(String name) {
        this.name = name;
    }

    public int hashCode() { return name.hashCode(); }
    public boolean equals(Object o) {
        return this.name.equals(((Player)o).name);
    }
}

class Score implements Comparable<Score> {
    String name;
    int score;

    Score(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int compareTo(Score o) {
        return o.score - this.score; // descending
    }
}

public class GameSystem {
    public static void main(String[] args) {

        Set<Player> players = new HashSet<>();
        players.add(new Player("A"));
        players.add(new Player("B"));

        Queue<String> matches = new LinkedList<>();
        matches.add("A vs B");

        List<String> results = new ArrayList<>();
        TreeSet<Score> leaderboard = new TreeSet<>();

        while (!matches.isEmpty()) {
            String m = matches.remove();
            results.add(m);

            leaderboard.add(new Score("A", 50));
            leaderboard.add(new Score("B", 70));
        }

        for (Score s : leaderboard) {
            System.out.println(s.name + " " + s.score);
        }
    }
}
