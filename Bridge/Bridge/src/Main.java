public class Main {

	public static void main(String[] args) {

		RuralCompany rural = new RuralCompany();
		CityCompany city = new CityCompany();

		IRoofCreator cityRoofInRuralCompany = new CityRoofCreator();

		rural.buildFloor();

		rural.setCreator(cityRoofInRuralCompany);
		rural.buildRoof();
		
		
		IRoofCreator ruralRoof = new RuralRoofCreator();
		rural.setCreator(ruralRoof);
		rural.buildRoof();
	}

}
