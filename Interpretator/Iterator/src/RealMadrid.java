import java.util.Arrays;
import java.util.Iterator;

public class RealMadrid implements Iterable<String> {

	private String[] team;

	public RealMadrid() {
		team = new String[3];
		team[0] = "Cristiano Ronaldo";
		team[1] = "Karim Benzema";

	}

	public String[] getTeam() {
		return team;
	}

	@Override
	public Iterator<String> iterator() {

		return Arrays.asList(team).iterator();
	}

}
