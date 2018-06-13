import java.text.DecimalFormat;

public class Test {
	
	public static void main(String[] args) {
	
//	HouseBlend hb = new HouseBlend();
//	DarkRoast dr = new DarkRoast();
//	Decaf decaf = new Decaf();
//	Espresso es = new Espresso();
//	
//	System.out.println(hb.cost());
//	System.out.println(dr.getDescription());
//	System.out.println(hb.toString());
	
	Beverage bev = new Espresso();
	System.out.println(bev.getDescription() + " $" + bev.cost());
	
	DecimalFormat df = new DecimalFormat("###.#");
	
	Beverage bev2 = new DarkRoast();
	bev2 = new Mocha(bev2);
	bev2 = new Mocha(bev2);
	bev2 = new Whip(bev2);
	System.out.println(bev2.getDescription() + " $" + df.format(bev2.cost()));
	
	
	}

}
