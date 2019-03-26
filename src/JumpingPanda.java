import java.util.ArrayList;
import java.util.HashMap;
//Ugró panda osztály, a Panda leszármazottja
public class JumpingPanda extends Panda{
	//A panda, ha a megfelelo hangot hallja, ugrik
	public void Jump(Animal animal, Tile tile,int steps,Animal puller, Panda pulled, ArrayList<Orangutan> orangutans,ArrayList<Panda> pandas,Game game){
		System.out.println("Jump()");
		tile.JumpedOn(animal, steps,puller,pulled,orangutans,pandas,game); //Az adott mezore ugrik
	}
	//Idoben léptetés
	public void Step() { 
		System.out.println("Step()");
	}
	//A csokiautomata sípoláskor értesíti az ugró pandákat. Ha egy ugró panda a csokiautomata szomszéd csempéjén van, akkor ugrik
	public void Update(Animal animal,Observable ob,Tile t, HashMap<Integer, Tile> neighbors,Animal puller, Panda pulled,ArrayList<Orangutan> orangutans,ArrayList<Panda> pandas,int steps, Game game,boolean tired) {
			int side=t.CompareTile(t, neighbors);
			if (side==-1)	//ugyanazon a csempén van a panda és a csokiautomata
				Jump(animal, t,steps,puller,pulled,orangutans,pandas,game);
			else if (side>0)	//szomszéd csempén vannak
			{
				Jump(animal, t,steps,puller,pulled,orangutans,pandas,game);
			}
	} 
}
