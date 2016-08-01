package foodpackage.fruitpackage;

public class FoodMain{

	public static void main(String []args){
		Food myfood = new Food("mole","El mole es una comida deliciosa");
		System.out.println("El nombre de la comida es: " + myfood.getNameFood());
		System.out.println("La descripcion de la comida es: " + myfood.getDescription()); 
	}

}
