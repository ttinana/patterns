package players;

import java.util.Observable;
import java.util.Observer;

public class RiskyPlayer implements IObserver {

	@Override
	public void update(ISubject subject) {
		System.out.println("Heard the ghong");

	}

}
