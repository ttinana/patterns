package players;

public class CalmPlayer implements IObserver {

	@Override
	public void update(ISubject subject) {
		System.out.println("Inched nose");

	}

}
