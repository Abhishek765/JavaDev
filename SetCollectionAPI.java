import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

public class SetCollectionAPI {
    public static void main(String[] args) {
        Set<Integer> notSortedNums = new HashSet<Integer>(); // ! Unique value but Not sorted
        Set<Integer> sortedNums = new TreeSet<Integer>(); // ! Unique and Sorted

        notSortedNums.add(2);
        notSortedNums.add(456);
        notSortedNums.add(42);
        notSortedNums.add(2);
        notSortedNums.add(3);
        notSortedNums.add(5);

        sortedNums.add(2);
        sortedNums.add(456);
        sortedNums.add(42);
        sortedNums.add(2);
        sortedNums.add(3);
        sortedNums.add(5);

        System.out.println(notSortedNums); // this will return empty list
        System.out.println(sortedNums); // this will return empty list

        System.out.println("sorted");
        for (Integer num : sortedNums) {
            System.out.println(num);
        }

        System.out.println("Not sorted");
        // for (Integer num : notSortedNums) {
        // System.out.println(num);
        // }

        // ** ---- looping using iterable */
        Iterator<Integer> it = sortedNums.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

}
