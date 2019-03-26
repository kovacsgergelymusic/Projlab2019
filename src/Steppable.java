import java.util.ArrayList;
import java.util.HashMap;
//Steppable interfész az időkezeléshez
public interface Steppable {
	//Idoben léptetés
	public void Step(Animal animal, int random,ArrayList<Observer> observers,Observable ob,Tile t, HashMap<Integer, Tile> neighbors,Animal puller, Panda pulled,int steps,Game game,ArrayList<Orangutan> orangutans, ArrayList<Panda> pandas,boolean tired);
}

