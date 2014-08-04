public abstract class IBuildingCompany {

	private IRoofCreator creator;

	public void buildRoof() {
		creator.build();
	}

	public abstract void buildFloor();

	public void setCreator(IRoofCreator creator) {
		this.creator = creator;
	}

}
