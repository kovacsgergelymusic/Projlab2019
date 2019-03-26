import java.util.ArrayList;
//Game oszt�ly, singleton, ellenorzi, hogy v�ge van-e a j�t�knak
public final class Game {
	private static Game game;
	private Game() {}
	//J�t�k v�ge
	public void EndGame() {
	System.out.println("EndGame()");
	}
	//Ellenorzi, hogy v�ge van-e a j�t�knak. 
	public void CheckEndGame(ArrayList<Orangutan> orangutans,ArrayList<Panda> pandas) {
		System.out.println("CheckEndGame()");
		if (orangutans.isEmpty()||pandas.isEmpty()){ //ha nincs m�r t�bb �llat
			EndGame();
		}
	}
	//Torol egy �llatot a j�t�kb�l
	public void DeleteAnimal(Animal a,ArrayList<Orangutan> orangutans,ArrayList<Panda> pandas) {
		System.out.println("DeleteAnimal(Animal a)");
		orangutans.remove(a);
		pandas.remove(a);
		CheckEndGame(orangutans,pandas); //Ha nincs m�r t�bb �llat, j�t�k v�ge
	}
	public Timer GetTimer(Timer timer) {
		System.out.println("GetTimer(Timer timer)");
		return timer;
	}
	//Singleton modell alkalmaz�sa
	public static Game getInstance() {
        if(game == null) {
            game = new Game();
        }
        return game;
    }
}
