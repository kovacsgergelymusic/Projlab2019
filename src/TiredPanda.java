import java.util.ArrayList;
import java.util.HashMap;
//Fáradékony panda, panda leszármazottja
public class TiredPanda extends Panda {
	//Panda, ha fáradt és res fotel van szomszédos csempén, akkor leül
	public void Sit( Animal puller, Panda pulled) {
		System.out.println("Sit()");
		if (puller!=null||pulled!=null)
		Disband(puller, pulled, null);	//ha volt sora, az felbomlik
	}
	//Idoben léptetés
	public void Step() {
		System.out.println("Step()");
	}
	//A fotel értesítését kezeli
	public void Update(Animal animal, Observable ob,Tile t, HashMap<Integer, Tile> neighbors,Animal puller, Panda pulled,ArrayList<Orangutan> orangutans,ArrayList<Panda> pandas,int steps, Game game,boolean tired) {
		System.out.println("Update(Observable ob)");
		if (tired)	//ha fáradt a panda
		{
			int side=t.CompareTile(t, neighbors);
			if (side==-1)	//ha ugyanazon a csempén van a panda és a fotel
			{
				Sit(puller,pulled);
			}
			else if (side>0)	//ha szomszédos csempén vannak
			{
				Sit(puller, pulled);
			}
		}
	}
}
