import java.util.ArrayList;
import java.util.Hashtable;
public class Tile {
	private int sides;
	private Hashtable<Integer,Tile> neighbors;
	private Animal animal;
	private Thing thing;
	public boolean AcceptPanda(Panda p) {return true;}
	public boolean AcceptOrangutan(Orangutan o) {return true;}
	public void RemoveAnimal(Animal a) {}
	public void JumpedOn() {}
	public Tile GetNeighbor(int side) {return null;}
	public int GetSides() {return sides;}
	public int CompareTile(Tile t) {return 0;}
	public void SetAnimal (Animal a) {animal=a;}
}
