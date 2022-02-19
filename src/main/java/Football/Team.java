package Football;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private String strName;
    private List<Player> players;
    private double ratting;
    public Team(String name) {
        this.setName(name);
        this.players=new ArrayList<>();
        this.ratting = 0.0;
    }
    public void setName(String name) {
        if (!name.isEmpty())
            this.strName = name;
        else
            throw new IllegalArgumentException("A name should not be empty.");
    }
    public void addPlayer(Player pl) {
        this.players.add(pl);

    }
    public void deletePlayer(Player pl) {
        if (this.players.contains(pl))
            this.players.remove(pl);
        else
            throw new IllegalArgumentException("Player "+pl.getName()+" is not in " + this.strName + " team.");
    }
    public double calculateRatting() {
        this.ratting = 0;
        for (Player player : players) {
            this.ratting = this.ratting + player.getStatus();
        }
        this.ratting = this.ratting/this.players.size();
        return this.ratting;
    }
    public String getName() {return this.strName;}
}
