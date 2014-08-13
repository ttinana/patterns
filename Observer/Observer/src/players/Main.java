package players;

public class Main {

	public static void main(String[] args) {

		BoxFight fight = new BoxFight();
		RiskyPlayer risky = new RiskyPlayer();
		CalmPlayer calm = new CalmPlayer();

		fight.attachObserver(calm);
		fight.attachObserver(risky);

		fight.nextRound();
		fight.nextRound();

	}

}
