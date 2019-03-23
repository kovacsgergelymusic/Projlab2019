
public class Wardrobe extends Tile {
	
	public boolean AcceptPanda(Panda p, Wardrobe tile) {
		System.out.println("AcceptPanda(Panda p)");
		return true;}
	public boolean AcceptOrangutan(Orangutan o, Wardrobe tile) {
		System.out.println("AcceptOrangutan(Orangutan o)");
		return true;}
}
