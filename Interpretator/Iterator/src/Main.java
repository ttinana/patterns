public class Main {

	public static void main(String[] args) {

		UkraineTeam uk = new UkraineTeam();
		RealMadrid rm = new RealMadrid();

		Manager m = new Manager();

		m.showList(uk.iterator(), rm.iterator());

	}

}
