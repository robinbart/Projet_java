
public class Caisse extends Mobile {
	public Caisse(Configuration c, Position p) {
		super(p,c,Type.CAISSE);
	}
	public boolean bougerVers(Direction d) {
		if(super.configuration.estVide(getPosition().add(d))) {
			return true;
		}
		getPosition().sub(d);
		return false;
	}
}
