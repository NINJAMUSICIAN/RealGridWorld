import info.gridworld.actor.Bug;

/**
 * A <code>ZBug</code> traces out a square "box" of a given size. <br />
 * The implementation of this class is testable on the AP CS A and AB exams.
 */
public class ZBug extends Bug
{
    private int steps;
    private int sideLength;

    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     */
    public ZBug(int length)
    {
        steps = 0;
        sideLength = length;
    }

    public void makeLines(){
	turn();
	turn();
	if(steps<sideLength && canMove()){
    	    move();
	    steps++;
	}else{
	    steps = 0;
	}	
}

    public void makeDiagonals()
    {
	turn();
	turn();
	if(steps<sideLength - 1 && canMove()){
    	    move();
	    steps++;
	}else{
		steps = 0;
		turn();	
		turn();	
		turn();
		turn();
	}
}
    public void act()
    {
	if(steps<sideLength && canMove()){
    	    move();
	    steps++;
	}else{
	steps = 0;
	}	
	
    }
//i made a new method to do the diagonals of the Z while Nick Pfeufer added all the movements in the act method.
}
