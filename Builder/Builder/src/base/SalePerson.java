package base;

public class SalePerson {

	private AbstractBuilder builder;

	public void setBuilder(AbstractBuilder b) {
		this.builder = b;

	}

	public void buildComp() {
		builder.createLaptop();
		builder.setCpus();
		builder.setName();
	}

	public Laptop getReadyLaptop() {
		return builder.laptop;
	}

}
