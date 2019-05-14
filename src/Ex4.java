import java.util.HashMap;
import java.util.Map;

public class Ex4 {

        public static void main(String[] args) {

            String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex","Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate" };
            int[] time = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265 };
            int n = time.length;

            Map<String, Integer> results = new HashMap<String, Integer>();

            for(int i=0; i<n; ) {
                results.put(names[i], time[i]);
                i++;
            }

            results.entrySet().stream()
                    .sorted(Map.Entry.<String, Integer>comparingByValue())
                    .forEach(System.out::println);


        }

}
