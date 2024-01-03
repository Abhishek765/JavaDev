import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class SortingExample {
    public static void main(String[] args) {

        // Swapping based on the last digit
        Comparator<Integer> com = new Comparator<Integer>() {

            @Override
            public int compare(Integer a, Integer b) {
                return a % 10 > b % 10 ? 1 : -1; // 1 -> swap, -1 -> don't swap
            }

        };

        List<Integer> nums = new ArrayList<>();
        nums.add(43);
        nums.add(21);
        nums.add(72);
        nums.add(29);

        Collections.sort(nums, com);

        System.out.println(nums);

    }

}
