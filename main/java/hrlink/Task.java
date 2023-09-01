package hrlink;

import java.util.Objects;

public class Task implements Solution {
    private int round = 1;
    private static int length;

    public boolean samePositionInNextStepInDirection(Ant ant1, Ant ant2) {
        String direction = ant1.getDirection();

        int delta = (direction.equals("toLeft")) ? -1 : 1;

        return ant1.getPosition() + delta == ant2.getPosition();
    }

    @Override
    public void twistAnts(Ant ant1, Ant ant2) {
        String ant1Direction = ant1.getDirection();
        String ant2Direction = ant2.getDirection();
        
        ant1.setDirection(ant2Direction);
        ant2.setDirection(ant1Direction);
    }

    public boolean checkFallInRound(Ant ant1, Ant ant2) {
        int toLeftAntPos = (Objects.equals(ant1.getDirection(), "toLeft")) ? ant1.getPosition() : ant2.getPosition();
        int toRightAntPos = (Objects.equals(ant1.getDirection(), "toRight")) ? ant1.getPosition() : ant2.getPosition();

        return toLeftAntPos < 0 || toRightAntPos > length;
    }

    @Override
    public void nextRound() {
        round++;
    }

    public int solve(int n, int left, int right) {
        length = n;

        Ant ant1 = new Ant(left, "toLeft");
        Ant ant2 = new Ant(right, "toRight");

        while (true) {

            if (samePositionInNextStepInDirection(ant1, ant2)) {
                twistAnts(ant1, ant2);
            }
            ant1.makeStep();

            if (samePositionInNextStepInDirection(ant2, ant1)) {
                twistAnts(ant2, ant1);
            }
            ant2.makeStep();

            if (checkFallInRound(ant1, ant2))
                return round;


            nextRound();
        }

    }
}
