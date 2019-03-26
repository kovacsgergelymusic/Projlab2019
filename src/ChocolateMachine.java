import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
//Csokiautomata oszt�ly, a Thing lesz�rmazottja
public class ChocolateMachine extends Thing{
	//A csokiautomata hangot ad �s errol �rtes�ti a feliratkoz�kat
	public void Whistle(Animal animal, ArrayList<Observer> observers,Observable ob,Tile t, HashMap<Integer, Tile> neighbors,Animal puller, Panda pulled,int steps,Game game,ArrayList<Orangutan> orangutans, ArrayList<Panda> pandas,boolean tired) {
		System.out.println("Whistle()");
		Notify(animal,observers,ob,t,neighbors,puller,pulled,steps,game,orangutans, pandas,tired);
	}
	//Idoben l�ptet�s, kezeli, hogy mikor ad hangot a csokiautomata
	public void Step(Animal animal,int random,ArrayList<Observer> observers,Observable ob,Tile t, HashMap<Integer, Tile> neighbors,Animal puller, Panda pulled,int steps,Game game,ArrayList<Orangutan> orangutans, ArrayList<Panda> pandas,boolean tired) { //tesztelés alatt nem randomozunk
		System.out.println("Step()");
		if (random<2) { //most meg mindig
			Whistle(animal,observers,ob,t,neighbors,puller,pulled,steps,game,orangutans,pandas,tired);
		}
	}
	//A Csokiautomat�ra feliratkozott observerek �rtes�t�se
	public void Notify(Animal animal,ArrayList<Observer> observers,Observable ob,Tile t, HashMap<Integer, Tile> neighbors,Animal puller, Panda pulled,int steps,Game game,ArrayList<Orangutan> orangutans, ArrayList<Panda> pandas,boolean tired) {
		System.out.println("Notify()");
		for (Observer o:observers) {
			o.Update(animal,this,t,neighbors,puller,pulled,orangutans,pandas,steps,game,tired);
		}
	}
	//Leiratkoz�s
	public void Detach(Observer o) {
		System.out.println("Detach(Observer o)");
	}	
}
