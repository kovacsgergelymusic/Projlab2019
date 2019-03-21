import java.util.ArrayList;
import java.util.Hashtable;
public class Tile {
	private int sides;
	private Hashtable<Integer,Tile> neighbors;
	protected Animal animal;
	private Thing thing;
	public boolean AcceptPanda(Panda p) {
		if (animal!=null) {
			animal.CollideWithPanda(p);
			return false;
		}
		return true;
	}
	public boolean AcceptOrangutan(Orangutan o) {
		if (animal!=null){
			if (animal.CollideWithOrangutan(o)==true) {
				return true;
			}
			else {
				return false;
			}
		}
		return true;
	}
	public void RemoveAnimal() {
		this.animal=null;
	}
	public void JumpedOn() {}
	public Tile GetNeighbor(int side) {
		return neighbors.get(side);
	}
	public int GetSides() {
		return sides;
	}
	public int CompareTile(Tile t) {return 0;}  //nincs kész
	public void SetAnimal (Animal a) {
		animal=a;
	}
}
