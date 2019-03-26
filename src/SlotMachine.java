import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
//Játékgép osztály, a Thing leszármazottja
public class SlotMachine extends Thing {
	//A játékgép csilingel, errol értesíti az ijedos pandákat
	public void Jingle(Animal animal,ArrayList<Observer> observers,Observable ob,Tile t, HashMap<Integer, Tile> neighbors,Animal puller, Panda pulled, Game game,ArrayList<Orangutan> orangutans, ArrayList<Panda> pandas,boolean tired) {
		System.out.println("Jingle()");
		Notify(animal, observers,ob,t,neighbors,puller,pulled,0,game,orangutans,pandas,tired);
	}
	//Idoben léptetés, szabályozza, hogy mikor csilinel a gép
	public void Step(Animal animal, int random,ArrayList<Observer> observers,Observable ob,Tile t, HashMap<Integer, Tile> neighbors,Animal puller, Panda pulled,int steps,Game game,ArrayList<Orangutan> orangutans, ArrayList<Panda> pandas,boolean tired) {
		System.out.println("Step()");
		if (random<2) { 
			Jingle(animal,observers,ob,t,neighbors,puller, pulled,game,orangutans,pandas,tired);
		}
	}
	//Feliratkozottak értesítése
	public void Notify(Animal animal, ArrayList<Observer> observers,Observable ob,Tile t, HashMap<Integer, Tile> neighbors,Animal puller, Panda pulled,int steps,Game game,ArrayList<Orangutan> orangutans, ArrayList<Panda> pandas,boolean tired) {
		System.out.println("Notify()");
		for (Observer o:observers) {
			o.Update(animal, this,t,neighbors,puller,pulled,orangutans,pandas,0,game,tired);
		}
	}
	//Leiratkoztatás
	public void Detach(Observer o) {
		System.out.println("Detach(Observer o)");
	}
}
