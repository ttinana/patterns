public class Brain {

	private Ear ear;
	public Ear getEar() {
		return ear;
	}

	public void setEar(Ear ear) {
		this.ear = ear;
	}

	public Heart getHeart() {
		return heart;
	}

	public void setHeart(Heart heart) {
		this.heart = heart;
	}

	public Leg getLeg() {
		return leg;
	}

	public void setLeg(Leg leg) {
		this.leg = leg;
	}

	private Heart heart;
	private Leg leg;

	public Brain() {
		createParts();
	}

	private void createParts() {
		ear = new Ear(this);
		heart = new Heart(this);
		leg = new Leg(this);
	}

	public void somethingHapened(BodyPart b) {

		if (b instanceof Ear) {
			((Ear) b).hear();
		} else if (b instanceof Heart) {
			((Heart) b).beat();
		} else if (b instanceof Leg) {
			((Leg) b).move();
			heart.beat();
		}

	}

}
