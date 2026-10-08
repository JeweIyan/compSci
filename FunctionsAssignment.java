
import java.util.Scanner;
//julian clissold
//sept 23 2026
public class FunctionsAssignment{
    public static void main(String[] args){
        //number 1
        Scanner in = new Scanner(System.in);
        System.out.println("what word do you want: ");
        String choice = in.next();
        System.out.println(mix(choice));

        //number 2
        calcHype(3,4);


    }
    public static String mix(String word){
        char word1 = word.charAt(word.length() - 1);
        String word2 = word.substring(1 , word.length() - 1);
        char word3 = word.charAt(0);
        String finalWord = word1 + word2 + word3;
        return finalWord; 
    }
    public static void calcHype(double num1, double num2){
        double a = num1*num1;
        double b = num2*num2;
        double c = Math.sqrt(a + b);
        System.out.println(c);
    }

}