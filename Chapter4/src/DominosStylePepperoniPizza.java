
public class DominosStylePepperoniPizza extends Pizza {
	public DominosStylePepperoniPizza() {
		name = "Dominos Style Pepperoni Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
 
		toppings.add("Shredded Mozzarella Cheese");
		toppings.add("Black Olives");
		toppings.add("Spinach");
		toppings.add("Eggplant");
		toppings.add("Sliced Pepperoni");
	}
 
	void cut() {
		System.out.println("Cutting the pizza");
	}
}
