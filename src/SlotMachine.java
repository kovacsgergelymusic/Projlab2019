import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
//J�t�kg�p oszt�ly, a Thing lesz�rmazottja
public class SlotMachine extends Thing {
	//A j�t�kg�p csilingel, errol �rtes�ti az ijedos pand�kat
	public void Jingle(Animal animal,ArrayList<Observer> observers,Observable ob,Tile t, HashMap<Integer, Tile> neighbors,Animal puller, Panda pulled, Game game,ArrayList<Orangutan> orangutans, ArrayList<Panda> pandas,boolean tired) {
		System.out.println("Jingle()");
		Notify(animal, observers,ob,t,neighbors,puller,pulled,0,game,orangutans,pandas,tired);
	}
	//Idoben l�ptet�s, szab�lyozza, hogy mikor csilinel a g�p
	public void Step(Animal animal, int random,ArrayList<Observer> observers,Observable ob,Tile t, HashMap<Integer, Tile> neighbors,Animal puller, Panda pulled,int steps,Game game,ArrayList<Orangutan> orangutans, ArrayList<Panda> pandas,boolean tired) {
		System.out.println("Step()");
		if (random<2) { 
			Jingle(animal,observers,ob,t,neighbors,puller, pulled,game,orangutans,pandas,tired);
		}
	}
	//Feliratkozottak �rtes�t�se
	public void Notify(Animal animal, ArrayList<Observer> observers,Observable ob,Tile t, HashMap<Integer, Tile> neighbors,Animal puller, Panda pulled,int steps,Game game,ArrayList<Orangutan> orangutans, ArrayList<Panda> pandas,boolean tired) {
		System.out.println("Notify()");
		for (Observer o:observers) {
			o.Update(animal, this,t,neighbors,puller,pulled,orangutans,pandas,0,game,tired);
		}
	}
	//Leiratkoztat�s
	public void Detach(Observer o) {
		System.out.println("Detach(Observer o)");
	}
}
