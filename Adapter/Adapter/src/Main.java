public class Main {

	public static void main(String[] args) {
		ElectricitySystem es = new ElectricitySystem();

		OldElectricirySystem old = new OldElectricirySystem();
		Adapter adapter = new Adapter(old);
		es.chargeNoteBook(adapter);

		NewElectricitySystem ne = new NewElectricitySystem();
		es.chargeNoteBook(ne);
	}
}
