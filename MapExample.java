import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> studentsHashMap = new HashMap<String, Integer>(); // not Synchronized
        // Map<String, Integer> studentsHashMap = new Hashtable<String, Integer>(); // Synchronized -> Thread safe
        Map<String, Integer> studentsTreeMap = new TreeMap<String, Integer>();

        System.out.println("-------- HashMap --------");
        studentsHashMap.put("Student1", 90);
        studentsHashMap.put("Student3", 95);
        studentsHashMap.put("Student2", 93);

        System.out.println(studentsHashMap);

        for (String name : studentsHashMap.keySet()) {
            System.out.println(name + ": " + studentsHashMap.get(name));
        }

        System.out.println("-------- TreeMap --------");
        // ! Sorted by keys
        studentsTreeMap.put("Student1", 80);
        studentsTreeMap.put("Student4", 90);
        studentsTreeMap.put("Student2", 70);

        for (String name : studentsTreeMap.keySet()) {
            System.out.println(name + ": " + studentsTreeMap.get(name));
        }

    }

}
