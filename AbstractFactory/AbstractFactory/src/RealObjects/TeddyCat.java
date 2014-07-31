package RealObjects;

import InterfacesThings.Cat;

public class TeddyCat implements Cat {

	@Override
	public Cat getCat() {
		// TODO Auto-generated method stub
		return new TeddyCat();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "I'm TEDDY Cat and I'm very soft";
	}

}
