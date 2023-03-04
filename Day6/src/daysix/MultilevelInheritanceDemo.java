package daysix;

public class MultilevelInheritanceDemo {
	public static void main(String[] args) {
		City city=new City();
		city.setCityName("bangalore");
		city.setArea(264.2f);
		city.setStateName("karnataka");
		city.setLanguage("kannada");
		city.setCountryName("India");
		city.setCapital("Delhi");
		System.out.println(city);
	}

}
