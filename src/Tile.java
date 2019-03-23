import java.util.ArrayList;
import java.util.Hashtable;
public class Tile {
	
	public boolean AcceptPanda(Panda p,Animal animal) {
		System.out.println("AcceptPanda(Panda p)");
		if (animal!=null) {
			animal.CollideWithPanda(p);
			return false;
		}
		return true;
	}
	public boolean AcceptOrangutan(Orangutan o, Animal animal) {
		System.out.println("AcceptOrangutan(Orangutan o)");
		if (animal!=null){
			animal.CollideWithOrangutan(o);
			return false;
		}
		return true;
	}
	public void RemoveAnimal() {
		System.out.println("RemoveAnimal()");
		
	}
	public void JumpedOn() {
		System.out.println("JumpedOn()");
	}
	public Tile GetNeighbor(int side, Hashtable<Integer,Tile> neighbors) {
		System.out.println("GetNeighbor(int side)");
		return neighbors.get(side);
	}
	public int GetSides(int sides) {
		System.out.println("GetSides()");
		return sides;
	}
	public int CompareTile(Tile t) {
		System.out.println("CompareTile(Tile t)");
		return 0;}  //nincs kész
	public void SetAnimal (Animal a) {
		System.out.println("SetAnimal(Animal a)");
	}
}
