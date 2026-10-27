
public class AnimalInherit {
    public static void main(String args[]){
        Animal a = new Animal(true, "Grass", 4);
        System.out.println("Vegetarian: "+ a.isVegetarian());
        System.out.println("Eats: "+ a.getEats());
        System.out.println("No of Legs: "+ a.getNoOfLegs());
    }
}