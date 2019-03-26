import java.util.ArrayList;
import java.util.HashMap;
//Observer interfész  az Observer minta megvalósításához
public interface Observer {
	//Cselekvés értesítés esetén
	public void Update(Animal animal,Observable ob,Tile t, HashMap<Integer, Tile> neighbors,Animal puller, Panda pulled,ArrayList<Orangutan> orangutans,ArrayList<Panda> pandas,int steps, Game game,boolean tired);
}

