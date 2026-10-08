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
    }
}
