package Factories;

import InterfacesThings.Bear;
import InterfacesThings.Cat;

public interface AbstractFactory {

	public Bear getBear();

	public Cat getCat();

}
