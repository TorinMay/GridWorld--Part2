import info.gridworld.actor.Bug;

public class circleBug extends Bug {
    private int steps; 
    private int sideLength; 
    public circleBug(int n) { 
        sideLength = n; 
    } 
    public void act() { 
        if (steps < sideLength && canMove()) { 
            move(); 
            steps++; 
        } else { 
            turn(); 
            steps = 0; 
        } 
    }
}
