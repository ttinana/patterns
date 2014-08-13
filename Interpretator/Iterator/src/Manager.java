import java.util.Iterator;

public class Manager {

	public void showList(Iterator<String> first, Iterator<String> second) {

		System.out.println("first team");
		while (first.hasNext()) {
			String player = first.next();
			System.out.println(player);
		}
		System.out.println("Second team");
		while (second.hasNext()) {
			String player = second.next();
			System.out.println(player);
		}
	}
}
