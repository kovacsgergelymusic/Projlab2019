import java.util.ArrayList;
import java.util.HashMap;
//Observable interf�sz az Observer minta megval�s�t�s�hoz
public interface Observable {
	//leiratkoz�s
	public void Detach(Observer o);
	//feliratkozottak �rtes�t�se
	public void Notify(Animal animal,ArrayList<Observer> observers,Observable ob,Tile t, HashMap<Integer, Tile> neighbors,Animal puller, Panda pulled,int steps,Game game,ArrayList<Orangutan> orangutans, ArrayList<Panda> pandas,boolean tired);
}
