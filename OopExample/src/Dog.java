public class Dog{
    //instance variable
    private String name;
    private String breed;
    private boolean isHungry;
    private double weight;

    //constructer
    //initializes the instance variable
    public Dog(String dogBreed, String dogName, boolean dogHungry, double dogWeight){
        breed = dogBreed;
        name = dogName;
        isHungry = dogHungry;
        weight = dogWeight;
    }

    //overloaded constructor
    public Dog(){
        name = "unknown";
        breed = "mutt";
        isHungry = true;
        weight = 0;
    }
    
    public String getName(){
        return name;
    }

    public double getWeight(){
        return weight;
    }

    public String getBreed(){
        return breed;
    }

    public boolean getisHungry(){
        return isHungry;
    }



    public void setWeight(double newWeight){
        if(newWeight<0){
            weight = newWeight;
        }
        else{
            System.out.println("weight cannot be negative");
        }
    }

    public void setName(String newName){
        name = newName;
    }

    public void makeSound(){
        if(weight<20){
            System.out.println("yip yip");
        }
        else{
            System.out.println("woof woof");
        }
    }

    @Override
    //overriding toString
    public String toString(){
        return "dogs name:" + name + "| " + name + "'s breed:" + breed + "| is " + name + " hungry:" + isHungry + "| " + name + "'s weight:" + weight + name;
    }
}
