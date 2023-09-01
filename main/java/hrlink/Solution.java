package hrlink;

public interface Solution {

    boolean samePositionInNextStepInDirection(Ant ant1, Ant ant2);

    void twistAnts(Ant ant1, Ant ant2);

     void nextRound();

     boolean checkFallInRound(Ant ant1, Ant ant2);
}
