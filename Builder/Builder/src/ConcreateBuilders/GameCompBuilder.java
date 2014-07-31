package ConcreateBuilders;

import base.AbstractBuilder;

public class GameCompBuilder extends AbstractBuilder {

	@Override
	public void setCpus() {
		laptop.setCpus(8);

	}

	@Override
	public void setName() {
		laptop.setName("Intel");

	}

}
