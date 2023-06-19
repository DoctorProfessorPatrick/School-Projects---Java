
public class Main {

	public static void main(String[] args) 
	{
		FruitSalad fs = new FruitSalad ("Fruit Salad");
		Fruit Apple = new Fruit ("Apple");
		Fruit Orange = new Fruit ("Orange");
		Fruit Strawberry = new Fruit ("Strawberry");
		Fruit Melon = new Fruit ("Melon");
		Fruit Grapes = new Fruit ("Grapes");
		
		FruitSalad.addFruit(Apple);
		FruitSalad.addFruit(Orange);
		FruitSalad.addFruit(Strawberry);
		FruitSalad.addFruit(Melon);
		FruitSalad.addFruit(Grapes);
		
		System.out.println(fs);
	}

}
