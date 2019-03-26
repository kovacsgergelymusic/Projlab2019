import java.util.ArrayList;
//WeakTile osztály, a Tile leszármazottja
public class WeakTile extends Tile {
	//Gyengül a csempe. Ha túl sokszor lépnek rá, eltörik
	public boolean Damage (Animal animal,int n, int steps,Animal puller, Panda pulled, ArrayList<Orangutan> orangutans,ArrayList<Panda> pandas,Game game) {
		System.out.println("Damage(int n)");
		steps+=n;
		if (steps>19) { //többet sebzodött, mint 20
			Break(animal,puller,pulled,orangutans,pandas,game); //a csempe eltörik
			return true;
		}
		return false;
	}
	//A csempe eltörik, a rajta lévo állat leesik
	public void Break(Animal animal,Animal puller, Panda pulled, ArrayList<Orangutan> orangutans,ArrayList<Panda> pandas,Game game) {
		System.out.println("Break()");
		animal.Fall(this,game,puller,pulled,orangutans,pandas);
	}
	//Panda próbál a csempére mozogni
	@Override
	public boolean AcceptPanda(Panda p, Animal animal, int steps, Game game, Animal puller, Panda pulled, ArrayList<Orangutan> orangutans, ArrayList<Panda> pandas) {
		System.out.println("AcceptPanda(Panda p)");
		if (animal!=null) {
			animal.CollideWithPanda(p,pulled,null,null,null);
			return false;
		}
		this.Damage(animal, 1,steps,puller,pulled,orangutans,pandas,game);
		return true;
	}
	//Orángután próbál a csempére mozogni
	@Override
	public boolean AcceptOrangutan(Orangutan o, Animal animal, int steps,Game game,Animal puller, Panda pulled, ArrayList<Orangutan> orangutans,ArrayList<Panda> pandas) {
		System.out.println("AcceptOrangutan(Orangutan o)");
		if (animal!=null){
			animal.CollideWithOrangutan(o,null,null,null,null);
			return false;

		}
		boolean isDead = Damage(animal, 1,steps,puller,pulled,orangutans,pandas,game);
		if (isDead) return false;
		return true;
	}
	//A csempén lévo állat ugrik egyet
	public void JumpedOn(Animal animal, int steps,Animal puller, Panda pulled, ArrayList<Orangutan> orangutans,ArrayList<Panda> pandas,Game game) {
		System.out.println("JumpedOn()");
		Damage(animal, 5,steps,puller,pulled,orangutans,pandas,game);
	}
}
