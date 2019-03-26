import java.util.ArrayList;
import java.util.HashMap;
//F�rad�kony panda, panda lesz�rmazottja
public class TiredPanda extends Panda {
	//Panda, ha f�radt �s res fotel van szomsz�dos csemp�n, akkor le�l
	public void Sit( Animal puller, Panda pulled) {
		System.out.println("Sit()");
		if (puller!=null||pulled!=null)
		Disband(puller, pulled, null);	//ha volt sora, az felbomlik
	}
	//Idoben l�ptet�s
	public void Step() {
		System.out.println("Step()");
	}
	//A fotel �rtes�t�s�t kezeli
	public void Update(Animal animal, Observable ob,Tile t, HashMap<Integer, Tile> neighbors,Animal puller, Panda pulled,ArrayList<Orangutan> orangutans,ArrayList<Panda> pandas,int steps, Game game,boolean tired) {
		System.out.println("Update(Observable ob)");
		if (tired)	//ha f�radt a panda
		{
			int side=t.CompareTile(t, neighbors);
			if (side==-1)	//ha ugyanazon a csemp�n van a panda �s a fotel
			{
				Sit(puller,pulled);
			}
			else if (side>0)	//ha szomsz�dos csemp�n vannak
			{
				Sit(puller, pulled);
			}
		}
	}
}
