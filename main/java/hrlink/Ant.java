package hrlink;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ant {
    private int position;
    public String direction;

    public void makeStep() {
        if (direction.equals("toRight")) {
            position++;
        }
        if (direction.equals("toLeft")) {
            position--;
        }

    }

    public Ant(int position, String direction) {
        this.position = position;
        this.direction = direction;
    }
}
