
public class Position {
	private final int x, y;
	
	public Position(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public Position(Position i){
        this(i.x, i.y);
    }
    public Position add(Direction d){
        Position temp = new Position(x+d.getDx(), y+d.getDy());
        return temp;
    }
    public Position sub(Direction d){
        Position temp = new Position(x-d.getDx(), y-d.getDy());
        return temp;
    }
	public boolean equals(Object o) {
		if (this == o)
            return true;
        if(o ==null)
            return false;
        if (this.getClass()!=o.getClass()){
            return false;
		}
		Position p = (Position) o;
        if((p.x==this.x)&&(p.y==this.y)){
            return true;
        }
        else{
            return false;
        }
    }
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
    }
    public String toString(){
        return "("+x+","+y+")";
    }
}