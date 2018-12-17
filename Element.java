
public abstract class Element {
	Type type;
	public Element(Type type) {
		this.type = type;
	}
	public abstract boolean bougerVers (Direction d);
	public Type getType() {
		return type;
	}
}
