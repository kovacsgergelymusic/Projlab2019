import java.util.ArrayList;
import java.util.HashMap;
//Ijedos panda, a Panda lesz�rmazottja
public class ScaredPanda extends Panda {
	//A panda megijed
	public void GetScared(Animal puller, Panda pulled){
		System.out.println("GetScared()");
		if (puller!=null)
			Disband(puller, pulled);	//Ha sorban volt, az felbomlik
	}
	//Idoben l�ptet�s
	public void Step() {
		System.out.println("Step()");
	}
	//A panda reag�l �rtes�t�sre. A j�t�kg�p csilingel�s�re, ha az a szomsz�dos, vagy azonos csemp�n van, megijed a panda
	public void Update(Animal animal, Observable ob,Tile t, HashMap<Integer, Tile> neighbors,Animal puller, Panda pulled,ArrayList<Orangutan> orangutans,ArrayList<Panda> pandas,int steps, Game game,boolean tired){
		System.out.println("Update()");
		int side=t.CompareTile(t, neighbors);
		if (side==-1) //ha azonos csemp�n van a panda �s a j�t�kg�p
		{
			GetScared(puller, pulled);
		}
		else if (side>0)	//ha szomsz�dosak
		{
			GetScared(puller, pulled);
		}
	}
}
