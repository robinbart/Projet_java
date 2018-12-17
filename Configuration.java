import java.util.ArrayList;

public class Configuration {
	
	private ArrayList<Caisse> caisses;
    private Joueur joueur;
	private Niveau niveau;
	
    public Configuration(Niveau n,Position positionJoueur){
        this.caisses = new ArrayList<Caisse>();
        this.niveau = n;
        this.joueur = new Joueur(this,positionJoueur);
    }
    public Configuration(Configuration c){
		this(c.niveau, c.joueur.getPosition());
		this.caisses=c.caisses;
	}
	public int getX() {
		return niveau.getX();
	}
	public int getY() {
		return niveau.getY();
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
	public Joueur getJoueur() {
		return joueur;
	}
	public Niveau getNiveau() {
		return niveau;
	}
	public ArrayList<Caisse> getCaisses() {
		return caisses;
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
    public boolean estCible(Position p){
        return niveau.estCible(p);
    }
	public Element get(Position p){
        if(joueur.getPosition().equals(p)){
            return this.joueur;
        }
        int i;
        for(i=0;i<this.caisses.size();i++){
            if(caisses.get(i).getPosition().equals(p)){
                return caisses.get(i);
            }
        }
        return this.niveau.get(p);
    }
	public boolean bougerJoueurVers(Direction d) {
		return this.joueur.bougerVers(d);
	}
	public boolean victoire() {
		int i;
		for(i=0;i<this.caisses.size();i++){
            if(!estCible(caisses.get(i).getPosition())){
                return false;
            }
		}
		return true;
	}
	public String toString() {
		
		char[][] tab=new char[getX()][getY()];
		tab =niveau.toString(tab);
		int i;
		for(i=0;i<caisses.size();i++){
			if(tab[caisses.get(i).getPosition().getX()][caisses.get(i).getPosition().getY()]=='.')
				tab[caisses.get(i).getPosition().getX()][caisses.get(i).getPosition().getY()]='*';
			else
			tab[caisses.get(i).getPosition().getX()][caisses.get(i).getPosition().getY()]='$';
		}
		tab[joueur.getPosition().getX()][joueur.getPosition().getY()]='@';
		String s="";
		for(i=0;i<getY();i++){
			for(int j=0;j<getX();j++){
				s+=tab[j][i];
			}
			s+="\n";
		}
		return s;
	}
}
