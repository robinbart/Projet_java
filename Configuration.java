import java.util.ArrayList;

public class Configuration {
	
	private ArrayList<Caisse> caisses = new ArrayList<Caisse>();
	private Joueur j;
	private Niveau niveau;
	
	public Configuration(Niveau niveau, Position positionJoueur) {
		this.niveau=niveau;
	}
	public Configuration(Configuration c) {
		niveau=c.niveau;
		j=c.j;
	}
	public int getX() {
		return niveau.getY();
	}
	public int getY() {
		return niveau.getX();
	}
	public boolean addCaisse(Position p) {
		for(Caisse c : caisses) {
			if(p.equals(c.getPosition())) {
				return false;
			}
		}
		if(niveau.estVide(p)) {
			caisses.add(new Caisse(this, p));
			return true;
		}
		return false;
	}
	public boolean estCaisse(Position p) {
		for(Caisse c : caisses) {
			if(p.equals(c.getPosition())) {
				return true;
			}
		}
		return false;
	}
	public boolean estVide(Position p) {
		for(Caisse c : caisses) {
			if(p.equals(c.getPosition())) {
				return false;
			}
		}
		if(niveau.estVide(p)) {
			return true;
		}
		return false;
	}
	public Element get(Position p) {
		
	}
	public boolean bougerJoueurVers(Direction d) {
		
	}
	public boolean victoire() {
		
	}
	public String toString() {
		
	}
}
