import java.util.ArrayList;
import java.util.HashMap;
//Ijedos panda, a Panda leszármazottja
public class ScaredPanda extends Panda {
	//A panda megijed
	public void GetScared(Animal puller, Panda pulled){
		System.out.println("GetScared()");
		if (puller!=null)
			Disband(puller, pulled);	//Ha sorban volt, az felbomlik
	}
	//Idoben léptetés
	public void Step() {
		System.out.println("Step()");
	}
	//A panda reagál értesítésre. A játékgép csilingelésére, ha az a szomszédos, vagy azonos csempén van, megijed a panda
	public void Update(Animal animal, Observable ob,Tile t, HashMap<Integer, Tile> neighbors,Animal puller, Panda pulled,ArrayList<Orangutan> orangutans,ArrayList<Panda> pandas,int steps, Game game,boolean tired){
		System.out.println("Update()");
		int side=t.CompareTile(t, neighbors);
		if (side==-1) //ha azonos csempén van a panda és a játékgép
		{
			GetScared(puller, pulled);
		}
		else if (side>0)	//ha szomszédosak
		{
			GetScared(puller, pulled);
		}
	}
}
