public abstract class Car {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void go() {
		System.out.println("I'm " + name);
	}
}
