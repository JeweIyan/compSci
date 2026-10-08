//Julian
//FunctionEx
//9/21/2026
public class FunctionsEx{
    public static void main(String[] argss){
        int answer = squared(5);
        System.out.println(answer);
        repeat("hey",4);
    }
    public static int squared(int num){
        return num * num;
    }
    public static void repeat(String word, int num){
        for(int i = 0;i<num; i++){
            System.out.println(word);
        }
    }
}