import java.util.ArrayList;
public class Timer {
	
	public void Tick(ArrayList<Steppable> steppables) {
		System.out.println("Tick()");
		for (Steppable s:steppables){
			s.Step();
		}
	}
	public void RemoveSteppable(Steppable s, ArrayList<Steppable> steppables) {
		System.out.println("RemoveSteppable(Steppable s)");
		steppables.remove(s);
	}
}
