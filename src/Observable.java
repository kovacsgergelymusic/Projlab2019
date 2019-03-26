import java.util.ArrayList;
import java.util.HashMap;
//Observable interfész az Observer minta megvalósításához
public interface Observable {
	//leiratkozás
	public void Detach(Observer o);
	//feliratkozottak értesítése
	public void Notify(Animal animal,ArrayList<Observer> observers,Observable ob,Tile t, HashMap<Integer, Tile> neighbors,Animal puller, Panda pulled,int steps,Game game,ArrayList<Orangutan> orangutans, ArrayList<Panda> pandas,boolean tired);
}
