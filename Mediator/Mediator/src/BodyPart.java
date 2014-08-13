public class BodyPart {

	private Brain brain;

	public BodyPart(Brain b) {
		brain = b;
	}

	public void change() {
		brain.somethingHapened(this);
	}

}
