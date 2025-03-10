public class Adapter implements INewElectricitySystem {
	private OldElectricirySystem adaptee;

	public Adapter(OldElectricirySystem old) {
		adaptee = old;
	}

	@Override
	public String matchWideSocket() {
		return adaptee.matchThinSocket();
	}

}
