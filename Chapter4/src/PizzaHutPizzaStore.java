
public class PizzaHutPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
		if (item.equals("cheese")) {
			return new PizzaHutStyleCheesePizza();
		} else if (item.equals("veggie")) {
			return new PizzaHutStyleVeggiePizza();
		} else if (item.equals("clam")) {
			return new PizzaHutStyleClamPizza();
		} else if (item.equals("pepperoni")) {
			return new PizzaHutStylePepperoniPizza();
		} else return null;
	}
}
