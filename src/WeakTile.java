import java.util.ArrayList;
//WeakTile oszt�ly, a Tile lesz�rmazottja
public class WeakTile extends Tile {
	//Gyeng�l a csempe. Ha t�l sokszor l�pnek r�, elt�rik
	public boolean Damage (Animal animal,int n, int steps,Animal puller, Panda pulled, ArrayList<Orangutan> orangutans,ArrayList<Panda> pandas,Game game) {
		System.out.println("Damage(int n)");
		steps+=n;
		if (steps>19) { //t�bbet sebzod�tt, mint 20
			Break(animal,puller,pulled,orangutans,pandas,game); //a csempe elt�rik
			return true;
		}
		return false;
	}
	//A csempe elt�rik, a rajta l�vo �llat leesik
	public void Break(Animal animal,Animal puller, Panda pulled, ArrayList<Orangutan> orangutans,ArrayList<Panda> pandas,Game game) {
		System.out.println("Break()");
		animal.Fall(this,game,puller,pulled,orangutans,pandas);
	}
	//Panda pr�b�l a csemp�re mozogni
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
	//Or�ngut�n pr�b�l a csemp�re mozogni
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
	//A csemp�n l�vo �llat ugrik egyet
	public void JumpedOn(Animal animal, int steps,Animal puller, Panda pulled, ArrayList<Orangutan> orangutans,ArrayList<Panda> pandas,Game game) {
		System.out.println("JumpedOn()");
		Damage(animal, 5,steps,puller,pulled,orangutans,pandas,game);
	}
}
