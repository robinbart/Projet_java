import java.util.ArrayList;

	
public class Niveau {
	
	private int size_X;
	private int size_Y;
	private Immobile [][]grille;
	private ArrayList<Position> cibles = new ArrayList<Position>();
	
	public Niveau(int x, int y) {
		grille = new Immobile[x][y];
		size_X = x;
		size_Y = y;
	}
	public int getX() {
		return size_X;
	}
	public int getY() {
		return size_Y;
	}
	public boolean addCible(Position p) {
		boolean b = true;
		for(Position p1 : cibles) {
			if(p.equals(p1)) {
				b = false;
				break;
			}
		}
		if(b) {
			cibles.add(p);
			return true;
		}
		return false;
	}
	public boolean addMur(Position p) {
		if(grille[p.getX()][p.getY()]!=null) {
			return false;
		}else {
			grille[p.getX()][p.getY()]=new Mur();
			return true;
		}
	}
	public boolean estCible(Position p) {
		for(Position p1 : cibles) {
			if(p.equals(p1)) {
				return true;
			}
		}
		return false;
	}
	public boolean estVide(Position p) {
		if(grille[p.getX()][p.getY()]==null) {
			return true;
		}
		return false;
	}
	public Element get(Position p){
		return grille[p.getX()][p.getY()];
	}
}
