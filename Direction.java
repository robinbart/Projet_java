import java.util.ArrayList;

public class Direction {
	
	private final int dx, dy;
	public static Direction HAUT = new Direction(0,-1);
	public static Direction BAS = new Direction(0,1);
	public static Direction DROITE = new Direction(1,0);
	public static Direction GAUCHE = new Direction(-1,0);
	private ArrayList<Direction> DIRECTION = new ArrayList<Direction>();
	
	public Direction( int dx, int dy) {
		this.dx=dx;
		this.dy=dy;
	}
	/*public ArrayList<Direction> getDirection(){
		ArrayList<Direction> tabdirection = new ArrayList<Direction>();
		Direction a = new Direction(0,-1);
		tabdirection.add(a);
		Direction b = new Direction(0,1);
		tabdirection.add(b);
		Direction c = new Direction(-1,0);
		tabdirection.add(c);
		Direction d = new Direction(1,0);
		tabdirection.add(d);
		return tabdirection;
	}*/
	public int getDx() {
		return dx;
	}
	public int getDy() {
		return dy;
	}
}
