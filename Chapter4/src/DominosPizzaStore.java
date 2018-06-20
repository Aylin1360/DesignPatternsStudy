

public class DominosPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
        	if (item.equals("cheese")) {
            		return new DominosStyleCheesePizza();
        	} else if (item.equals("veggie")) {
        	    	return new DominosStyleVeggiePizza();
        	} else if (item.equals("clam")) {
        	    	return new DominosStyleClamPizza();
        	} else if (item.equals("pepperoni")) {
            		return new DominosStylePepperoniPizza();
        	} else return null;
	}
}
