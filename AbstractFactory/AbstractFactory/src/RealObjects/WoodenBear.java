package RealObjects;

import InterfacesThings.Bear;

public class WoodenBear implements Bear {

	@Override
	public Bear getBear() {
		// TODO Auto-generated method stub
		return new WoodenBear();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "I'm wooden Bear, please don't burn me up, I'm good one";
	}

}
