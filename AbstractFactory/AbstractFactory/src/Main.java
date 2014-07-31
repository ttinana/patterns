import Factories.AbstractFactory;
import Factories.TeddyFactories;
import Factories.WoodenFactory;
import InterfacesThings.Bear;
import InterfacesThings.Cat;

public class Main {

	public static void main(String[] args) {

		AbstractFactory wooden = new WoodenFactory();
		AbstractFactory teddy = new TeddyFactories();

		Bear[] bears = { wooden.getBear(), teddy.getBear() };
		Cat[] cats = { wooden.getCat(), teddy.getCat() };

		for (int i = 0; i < bears.length; ++i) {
			System.out.println(bears[i]);
			System.out.println(cats[i]);
			System.out.println("------------------------");
		}

	}
}
