public class Test {
 
	public static void main(String[] args) {
		PizzaStore pizzaHut = new PizzaHutPizzaStore();
		PizzaStore dominosPizza = new DominosPizzaStore();
 
		Pizza pizza = pizzaHut.orderPizza("cheese");
		System.out.println("Ayþe ordered a " + pizza.getName() + "\n");
 
		pizza = dominosPizza.orderPizza("cheese");
		System.out.println("Fatma ordered a " + pizza.getName() + "\n");

		pizza = pizzaHut.orderPizza("clam");
		System.out.println("Hayriye ordered a " + pizza.getName() + "\n");
 

	}
}
