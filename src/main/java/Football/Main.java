package Football;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("********START********");
        List<Team> teams = new ArrayList<>();
        List<Player> players = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("END")){

            String[] inputArgs = input.split(";");
            switch (inputArgs[0]){
                case "Team":
                    try {
                        Team team = new Team(inputArgs[1]);
                        teams.add(team);
                    }catch (IllegalArgumentException ex){
                        System.out.println(ex.getMessage());
                        break;
                    }
                    break;
                case "Add":
                    String teamName = inputArgs[1];
                    String playerName = inputArgs[2];
                    int end=Integer.parseInt(inputArgs[3]);
                    int spr =Integer.parseInt(inputArgs[4]);
                    int drb = Integer.parseInt(inputArgs[5]);
                    int pass = Integer.parseInt(inputArgs[6]);
                    int shoot = Integer.parseInt(inputArgs[7]);
                    boolean added = false;
                    try {
                        Player player = new Player(playerName,end,spr,drb,pass,shoot);
                        players.add(player);
                        for (Team team : teams) {
                            if(team.getName().equals(teamName)){
                                added=true;
                                team.addPlayer(player);
                            }
                        }
                        if(!added){
                            System.out.println("Team "+teamName+" does not exist.");
                        }
                    }catch (IllegalArgumentException ex){
                        System.out.println(ex.getMessage());
                        break;
                    }
                    break;
                case "Remove":
                    String teamName1 = inputArgs[1];
                    String playerToRemoveName = inputArgs[2];
                    Player currPlayer =null;
                    for (Player player : players) {
                        if(player.getName().equals(playerToRemoveName)){
                            currPlayer=player;
                        }
                    }
                    if(currPlayer==null){
                        System.out.println("Player "+playerToRemoveName+" is not in "+ teamName1+" team.");
                        break;
                    }
                    try {
                        for (Team team : teams) {
                            if(team.getName().equals(teamName1)){
                                team.deletePlayer(currPlayer);
                            }
                        }
                    }catch (IllegalArgumentException ex){
                        System.out.println(ex.getMessage());
                        break;
                    }
                    break;
                case "Rating":
                    String teamName2 = inputArgs[1];
                    boolean exist=false;
                    for (Team team : teams) {
                        if(team.getName().equals(teamName2)){
                            System.out.println(team.getName() + " - " + Math.round(team.calculateRatting()));
                            exist=true;
                        }
                    }
                    if(!exist){
                        System.out.println("Team "+teamName2+" does not exist.");
                    }
                    break;
                default:break;

            }
            input=scanner.nextLine();
        }


    }

}
