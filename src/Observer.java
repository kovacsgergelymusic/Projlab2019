import java.util.ArrayList;
import java.util.HashMap;
//Observer interf�sz  az Observer minta megval�s�t�s�hoz
public interface Observer {
	//Cselekv�s �rtes�t�s eset�n
	public void Update(Animal animal,Observable ob,Tile t, HashMap<Integer, Tile> neighbors,Animal puller, Panda pulled,ArrayList<Orangutan> orangutans,ArrayList<Panda> pandas,int steps, Game game,boolean tired);
}

