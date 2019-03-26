import java.util.ArrayList;
import java.util.HashMap;
//Ugr� panda oszt�ly, a Panda lesz�rmazottja
public class JumpingPanda extends Panda{
	//A panda, ha a megfelelo hangot hallja, ugrik
	public void Jump(Animal animal, Tile tile,int steps,Animal puller, Panda pulled, ArrayList<Orangutan> orangutans,ArrayList<Panda> pandas,Game game){
		System.out.println("Jump()");
		tile.JumpedOn(animal, steps,puller,pulled,orangutans,pandas,game); //Az adott mezore ugrik
	}
	//Idoben l�ptet�s
	public void Step() { 
		System.out.println("Step()");
	}
	//A csokiautomata s�pol�skor �rtes�ti az ugr� pand�kat. Ha egy ugr� panda a csokiautomata szomsz�d csemp�j�n van, akkor ugrik
	public void Update(Animal animal,Observable ob,Tile t, HashMap<Integer, Tile> neighbors,Animal puller, Panda pulled,ArrayList<Orangutan> orangutans,ArrayList<Panda> pandas,int steps, Game game,boolean tired) {
			int side=t.CompareTile(t, neighbors);
			if (side==-1)	//ugyanazon a csemp�n van a panda �s a csokiautomata
				Jump(animal, t,steps,puller,pulled,orangutans,pandas,game);
			else if (side>0)	//szomsz�d csemp�n vannak
			{
				Jump(animal, t,steps,puller,pulled,orangutans,pandas,game);
			}
	} 
}
