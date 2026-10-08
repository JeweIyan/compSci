//sept 24 2026
public class MyProgram{
    public static void main(String[] args){
    //number 1
        String word = "HI";
        String ans1 = word.toLowerCase();
        System.out.println(ans1);
    //number 2
        double ans2 = Math.log(40);
        System.out.println(ans2);
    //number 3
        int ans3 = Integer.parseInt("5");
        System.out.println(ans3);
    //number 4
        double ans4 = divide(10);
        System.out.println(ans4);
    }
    public static double divide(int num){
        return num / 100.0;
    }
}