package ConcreateBuilders;

import base.AbstractBuilder;

public class BuisnessTripCompBuilder extends AbstractBuilder {

	@Override
	public void setCpus() {
		laptop.setCpus(2);

	}

	@Override
	public void setName() {
		laptop.setName("AMD");

	}

}
