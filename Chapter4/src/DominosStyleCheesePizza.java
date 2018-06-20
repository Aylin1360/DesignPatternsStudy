
public class DominosStyleCheesePizza extends Pizza {

	public DominosStyleCheesePizza() { 
		name = "Dominos Style Deep Dish Cheese Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
 
		toppings.add("Shredded Mozzarella Cheese");
	}
 
	void cut() {
		System.out.println("Cutting the pizza");
	}
}
