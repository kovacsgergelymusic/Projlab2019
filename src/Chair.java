import java.util.ArrayList;
import java.util.HashMap;
//Fotel osztály, a Thing leszármazottja
public class Chair extends Thing {
	//Léptetés idoben
	public void Step(Animal animal,int random,ArrayList<Observer> observers,Observable ob,Tile t, HashMap<Integer, Tile> neighbors,Animal puller, Panda pulled,int steps,Game game,ArrayList<Orangutan> orangutans, ArrayList<Panda> pandas,boolean tired) {
		System.out.println("Step()");
		if (random==0) {
			Notify(animal, observers,ob,t,neighbors,puller,pulled,0,game,orangutans,pandas,tired);
		}
	}
	//A Fotelre feliratkozott observerek értesítése
	public void Notify(Animal animal, ArrayList<Observer> observers,Observable ob,Tile t, HashMap<Integer, Tile> neighbors,Animal puller, Panda pulled,int steps,Game game,ArrayList<Orangutan> orangutans, ArrayList<Panda> pandas,boolean tired) {
		System.out.println("Notify()");
		for (Observer o:observers) {
			o.Update(animal,this,t,neighbors,puller,pulled,orangutans,pandas,0,game,tired);
		}
	}
	//Leiratkoztatás a fotelrol
	public void Detach(Observer o) {
		System.out.println("Detach(Observer o)");

	}
	public boolean GetOccupied(boolean occupied) {
		System.out.println("GetOccupied()");
		return occupied;
		}
	
}
