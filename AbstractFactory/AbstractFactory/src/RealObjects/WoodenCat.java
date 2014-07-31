package RealObjects;

import InterfacesThings.Cat;

public class WoodenCat implements Cat {

	@Override
	public Cat getCat() {
		// TODO Auto-generated method stub
		return new WoodenCat();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "I'm wooden Cat And I will scare you";
	}
}
