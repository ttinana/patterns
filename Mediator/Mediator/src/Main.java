public class Main {

	public static void main(String[] args) {

		Brain brain = new Brain();
		System.out.println("somebody playing music");
		brain.somethingHapened(brain.getEar());
		System.out.println("passed a ball");
		brain.somethingHapened(brain.getLeg());
		System.out.println("always...");
		brain.somethingHapened(brain.getHeart());
	}

}
