
public abstract class Mobile extends Element {
	
	private Position p1;
	protected Configuration configuration;
	
	public Mobile(Position p2, Configuration config, Type type) {
		super(type);
		p1 = p2;
		configuration = config;
	}
	
	public boolean setPosition(Position p) {
		if(configuration.estVide(p)) {
			p1 = p;
			return true;
		}
		return false;
	}
	
	public Position getPosition() {
		return p1;
	}
	
}
