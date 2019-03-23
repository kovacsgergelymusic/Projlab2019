
public class WeakTile extends Tile {

	public void Damage (int n, int steps) {
		System.out.println("Damage(int n)");
		steps+=n;
		if (steps>=20) {
			Break();
		}
	}
	public void Break() {
		System.out.println("Break()");
	}
	public boolean AcceptPanda(Panda p, Animal animal, int steps) {
		System.out.println("AcceptPanda(Panda p)");
		if (animal!=null) {
			animal.CollideWithPanda(p);
			return false;
		}
		Damage(1);
		return true;
	}
	public boolean AcceptOrangutan(Orangutan o, Animal animal, int steps) {
		System.out.println("AcceptOrangutan(Orangutan o)");
		if (animal!=null){
			if (animal.CollideWithOrangutan(o)==true) {
				Damage(1);
			}
		return false;	
		}
		return true;
	}
	public void JumpedOn(int steps) {
		System.out.println("JumpedOn()");
		Damage(5);
	}
}
