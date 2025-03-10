import java.util.ArrayList;
import java.util.List;

public class Foreman implements ICommand {

	private List<ICommand> comands;

	public Foreman() {
		comands = new ArrayList<ICommand>();
	}

	public boolean addJob(ICommand e) {
		return comands.add(e);
	}

	@Override
	public void execute() {
		for (ICommand c : comands) {
			c.execute();
		}

	}
}
