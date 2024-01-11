package Association;

public class PirmeMinister {
private String pmName;
private Country country;

public PirmeMinister (String pmName,Country country) {
	this.pmName = pmName;
	this.country = country;
	
}
public static void main(String[] args) {
	Country c = new Country("India");
	PirmeMinister pm = new PirmeMinister("Modi",c);
	System.out.println(pm.pmName);
	System.out.println(pm.country.getCountryName());
	System.out.println();
	
}
}
