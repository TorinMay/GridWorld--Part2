import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

public class circleBugRunner {
    public static void main(String[] args) {
        ActorWorld world = new ActorWorld();
        circleBug alice = new circleBug(5);
        alice.setColor(Color.ORANGE);
        // ZBug bob = new ZBug(2);
        world.add(new Location(2, 2), alice);
        // world.add(new Location(5, 5), bob);
        world.show();
    }
}