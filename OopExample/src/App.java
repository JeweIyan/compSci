public class App {
    public static void main(String[] args) throws Exception {
        Dog d1 = new Dog("corgi", "greg", true, 35.6);
        Dog d2 = new Dog("pitbull", "bruno", false, 78.9);
        Dog d3 = new Dog();


        d3.setName("mogo");
        d3.setWeight(18.6);
        System.out.println(d1);
        d1.makeSound();
        System.out.println(d2);
        d2.makeSound();
        System.out.println(d3);
        d3.makeSound();
        System.out.println(d3.getName());
        System.out.println(d3.getWeight());



        Dog[] dogs = new Dog[3];
        dogs[0] = d1;
        dogs[1] = new Dog("corgi", "greg", true, 35.6);
        dogs[2] = new Dog();

        for(int i = 0;i < dogs.length;i++){
            System.out.println(dogs[i]);
        }
    }
}
