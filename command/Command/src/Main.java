public class Main {

	public static void main(String[] args) {
		ICommand painter = new Pain();
		ICommand builder = new Building();

		Foreman man = new Foreman();

		man.addJob(builder);
		man.addJob(painter);

		man.execute();
	}
}
