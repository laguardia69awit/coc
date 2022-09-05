public class Gear {
    
    //Gear Attributes
String name;
String type;
String rarity;
int weight;
String description;

    //Gear Method

    //First Method
public void sayGearDescription() {
    System.out.println("Description:" + description);
}
    //Second Method
public void showAllAttributes() {
    System.out.println("name: " + name);
    System.out.println("type: " + type);
    System.out.println("rarity: " + rarity);
    System.out.println("weight is " + weight + " grams");
}

}
