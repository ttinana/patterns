package Factories;

import InterfacesThings.Bear;
import InterfacesThings.Cat;
import RealObjects.WoodenBear;
import RealObjects.WoodenCat;

public class WoodenFactory implements AbstractFactory {

	@Override
	public Bear getBear() {
		// TODO Auto-generated method stub
		return new WoodenBear();
	}

	@Override
	public Cat getCat() {
		// TODO Auto-generated method stub
		return new WoodenCat();
	}

}
