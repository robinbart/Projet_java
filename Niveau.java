import java.util.ArrayList;

	
public class Niveau {

	private Immobile [][]grille;
	private ArrayList<Position> cibles;
	
	public Niveau(int x, int y) {
		grille = new Immobile[x][y];
		this.cibles = new ArrayList<Position>();
		for(y=0;y<this.getY();y++){
			for(x=0;x<this.getX();x++){
				grille[x][y]= new Case();
			}
		}
	}
	public int getX(){
		return grille.length;
		
    }
    public int getY(){
        return grille[0].length;
    }
	public boolean addCible(Position p) {
		for(Position p1 : cibles) {
			if(p.equals(p1)) {
				return false;
			}
		}
		if((this.estVide(p))&&(!this.estCible(p))){
            cibles.add(p);
            return true;
        }
        else
        return false;
	}
	public boolean estVide(Position p) {
		if(grille[p.getX()][p.getY()].getType()==Type.CASE) {
			return true;
		}
		return false;
	}
	public boolean estCible(Position p) {
		for(Position p1 : cibles) {
			if(p.equals(p1)) {
				return true;
			}
		}
		return false;
	}
	public boolean addMur(Position p) {
		if(grille[p.getX()][p.getY()].getType()!=Type.CASE) {
			return false;
		}
		else {
			grille[p.getX()][p.getY()]=new Mur();
			return true;
		}
	}
	
	
	public Element get(Position p){
		return grille[p.getX()][p.getY()];
	}
	public String toString(){
		int x,y;
		String s="";
		for(y=0;y<this.getY();y++){
			for(x=0;x<this.getX();x++){
				if(grille[x][y]==null){
					s+= "-";
				}
				else if (grille[x][y].getType()== Type.MUR){
					s+="M";
				}
				else if (grille[x][y].getType()==Type.CASE){
					s+="C";
				}
			}
			s+="\n";
		}
		return s;
	}
	public char[][] toString(char[][] tab ){
		int x,y,i;
		for(y=0;y<this.getY();y++){
			for(x=0;x<this.getX();x++){
				if(grille[x][y]==null){
					tab[x][y]= '-';
				}
				else if (grille[x][y].getType()== Type.MUR){
					tab[x][y]='M';
				}
				else if (grille[x][y].getType()==Type.CASE){
					tab[x][y]='C';
				}
			}
		}
		for(i=0;i<cibles.size();i++){
			tab[cibles.get(i).getX()][cibles.get(i).getY()]='.';
		}
		return tab;
	}

}
