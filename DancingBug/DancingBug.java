import info.gridworld.actor.Bug;

public class DancingBug extends Bug {
    private int steps = 0;
    private int sideLength;
    private int times = 0;

    public DancingBug(int length) {
        sideLength = length;
        turn();
        turn();
        times++;
    }

    public void act() {
        if (times < 3) {
            if(steps < sideLength && canMove()) {
                steps++;
                times++;
                move();
                steps = 0;
            }else if(times == 1 && steps >= sideLength && canMove()) {
                turn();
                turn();
                turn();
                times++;
                steps = 0;

            }else {
                turn();
                turn();
                turn();
                turn();
                times++;
                steps = 0;
        }
            
        }
    }
}
