public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println(Method.add(3,4));
        System.out.println(sub(5,1));
    }
    public static int sub(int x, int y){
        return x-y;
    }
}
