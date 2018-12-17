
public class Caisse extends Mobile {
	public Caisse(Configuration c, Position p) {
		super(Type.CAISSE,p,c);
	}
	public boolean bougerVers(Direction d) {
		Position p=getPosition().add(d);
		if(super.configuration.estVide(p)) {
			super.setPosition(p);
			return true;
		}
		return false;
	}
}
