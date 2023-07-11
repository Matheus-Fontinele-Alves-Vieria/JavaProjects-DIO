package soccer;

import soccer.team.Attacker;
import soccer.team.Defender;
import soccer.team.Goalkeeper;

public class SoccerMatch {
    public static void main(String[] args) {
        Attacker attacker = new Attacker("Róger Guedes", 10);
        Defender defender = new Defender("Rafael Ramos", 2);
        Goalkeeper goalkeeper = new Goalkeeper("Cássio", 12);

        attacker.play();
        defender.play();
        goalkeeper.play();
    }
}
