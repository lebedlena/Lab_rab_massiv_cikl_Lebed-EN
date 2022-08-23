public class Main {
    public static void main(String[] args) {
        int [] nums = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        int mylt = nums[0];
        for (int i = 1; i < 9; i++) {
            mylt*=nums [i];

        }
        System.out.println(mylt);
    }

}