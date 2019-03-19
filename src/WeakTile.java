
public class WeakTile extends Tile {
	private int steps;
	private boolean broken;
	public void Damage (int n) {}
	public void Break() {}
	public boolean AcceptPanda(Panda p) {return true;}
	public boolean AcceptOrangutan(Orangutan o) {return true;}
	public void JumpedOn() {}
}
