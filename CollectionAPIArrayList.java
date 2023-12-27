import java.util.ArrayList;
import java.util.List;

public class CollectionAPIArrayList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();

        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        System.out.println(nums.get(0));
        System.out.println(nums.indexOf(2));
        System.out.println(nums.indexOf(0)); // this will return -1

        nums.clear();

        System.out.println(nums); // this will return empty list
        // for (Integer num : nums) {
        // System.out.println(num);
        // }
    }

}
