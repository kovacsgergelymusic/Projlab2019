import java.util.ArrayList;
//Game osztály, singleton, ellenorzi, hogy vége van-e a játéknak
public final class Game {
	private static Game game;
	private Game() {}
	//Játék vége
	public void EndGame() {
	System.out.println("EndGame()");
	}
	//Ellenorzi, hogy vége van-e a játéknak. 
	public void CheckEndGame(ArrayList<Orangutan> orangutans,ArrayList<Panda> pandas) {
		System.out.println("CheckEndGame()");
		if (orangutans.isEmpty()||pandas.isEmpty()){ //ha nincs már több állat
			EndGame();
		}
	}
	//Torol egy állatot a játékból
	public void DeleteAnimal(Animal a,ArrayList<Orangutan> orangutans,ArrayList<Panda> pandas) {
		System.out.println("DeleteAnimal(Animal a)");
		orangutans.remove(a);
		pandas.remove(a);
		CheckEndGame(orangutans,pandas); //Ha nincs már több állat, játék vége
	}
	public Timer GetTimer(Timer timer) {
		System.out.println("GetTimer(Timer timer)");
		return timer;
	}
	//Singleton modell alkalmazása
	public static Game getInstance() {
        if(game == null) {
            game = new Game();
        }
        return game;
    }
}
