package foodpackage.fruitpackage;

public class Food{

	private String nameFood;
	private String description;
	
	public Food(){

	}

	public Food(String nameFood, String description){
		this.nameFood = nameFood;
		this.description = description;
	}

	public void setNameFood(String nameFood){
		this.nameFood=nameFood;
	}

	public String getNameFood(){
		return this.nameFood;
	}

	public void setDescription(String description){
                this.description=description;
        }

        public String getDescription(){
                return this.description;
        }

}
