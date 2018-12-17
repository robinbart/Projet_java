import java.util.ArrayList;
public class Joueur extends Mobile{
	
	private ArrayList<Direction> histo = new ArrayList<Direction>();
	
	public Joueur(Configuration c,Position p) {
		super(Type.JOUEUR,p,c);
	}
	
	public Joueur(Configuration c,Joueur j) {
		super(Type.JOUEUR,j.getPosition(),c);
	}
	
	public ArrayList<Direction> getHisto() {
		return histo;
	}
	public int getNbCoups(){
		return histo.size();
	}
	//A modifier
	public boolean bougerVers(Direction d) {
		Position p=getPosition().add(d);
		if(super.configuration.estVide(p)){
			super.setPosition(p);
			return true;
		}
		if(super.configuration.estCaisse(p)) {
			if(super.configuration.get(p).bougerVers(d)){
			super.setPosition(p);
			return true;
			}
			else
			return false;
		}
		return false;
	}
}
