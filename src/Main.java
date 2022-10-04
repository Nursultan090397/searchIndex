public class Main {
    public static void main(String[] args) {
        int [] nums = {1,3,5,6};
        int target = 2; //1,4
        System.out.println(searchInsert(nums,target));

    }
    public static int searchInsert(int[] nums, int target) {
        int nachalnaya = 0;
        int konechnaya = nums.length - 1;
        while( nachalnaya <= konechnaya ) {

            int seredina = (nachalnaya + konechnaya) / 2;
            if(nums[seredina] == target) {
                return seredina;
            }
            else if (target > nums[seredina]) {
                nachalnaya = seredina + 1;
            }
            else {
                konechnaya = seredina - 1;
            }
        }
        return konechnaya + 1;
    }
}