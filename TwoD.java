public class TwoD{
    public static void main(String[] args){
        String[][] words = new String[3][2];
        //3 rows 2 col or 3 arrays of 2
        words[0][0] = "This";
        words[0][1] = "Is";
        words[1][0] = "a";
        words[1][1] = "2";
        words[2][0] = "D";
        words[2][1] = "Array";
        System.out.println(words.length);
        System.out.println(words[0].length);
        for(int row = 0; row<words.length; row++){
            for(int col = 0; col<words[0].length;col++){
                System.out.print(words[row][col] + " ");
            }
            System.out.println(" ");
        }

        int[][] nums = {{14, 50},{80, 73},{21, 60},{18,2}};
        System.out.println("rows" + nums.length);
        System.out.println("col" + nums[0].length);
        for(int col = 0; col<nums[0].length; col++){
            for(int row = 0; row<nums.length;row++){
                System.out.print(nums[row][col] + " ");
            }
            System.out.println(" ");
        }
    }
}