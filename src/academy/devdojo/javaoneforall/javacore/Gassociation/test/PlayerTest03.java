package academy.devdojo.javaoneforall.javacore.Gassociation.test;

import academy.devdojo.javaoneforall.javacore.Gassociation.domain.Player;
import academy.devdojo.javaoneforall.javacore.Gassociation.domain.Team;

public class PlayerTest03 {
    public static void main(String[] args) {
        Player player = new Player("Cafú");
        Player player2 = new Player("Pelé");
        Team team = new Team("Brazil");
        Player[] players = {player, player2};

        player.setTeam(team);
        player2.setTeam(team);
        team.setPlayers(players);

        System.out.println("---- Player ----");
        player.print();
        player2.print();
        System.out.println("---- Team ----");
        team.print();
    }
}
