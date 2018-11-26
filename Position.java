
public class Position {
	
	private int x, y;
	
	public Position(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public Position(Position p) {
		x=p.x;
		y=p.y;
	}
	
	public Position add(Direction a) {
		Position newP = new Position(x+a.getDx(), y+a.getDy());
		return newP;
	}
	
	public Position sub(Direction a) {
		Position newP = new Position(x-a.getDx(), y-a.getDy());
		return newP;
	}
	
	public boolean equals(Position p) {
		/*if(o.getClass() != this.getClass())
			return false;*/
		if(x == p.x && y == p.y) {
			return true;
		}else {
			return false;
		}
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
}
