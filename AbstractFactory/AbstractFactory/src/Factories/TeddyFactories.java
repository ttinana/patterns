package Factories;

import InterfacesThings.Bear;
import InterfacesThings.Cat;
import RealObjects.TeddyBear;
import RealObjects.TeddyCat;

public class TeddyFactories implements AbstractFactory {

	@Override
	public Bear getBear() {
		// TODO Auto-generated method stub
		return new TeddyBear();
	}

	@Override
	public Cat getCat() {
		// TODO Auto-generated method stub
		return new TeddyCat();
	}

}
