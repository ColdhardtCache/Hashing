// Brian Grier; Github.com/GrierTechSolutions
// Professor Stanley; Bridgewater State University

/*
    HashMaps must be imported in java using the following:
 */
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        /*
        Creates a hashmap (associate types together) with String types and integer types called map1
         */
        HashMap<String, Integer> map1 = new HashMap<>();

        /*
        An example of adding something to the hashmap
         */
        map1.put("john",24);
        map1.put("sean",27);
        /*
        .get will retrieve the Integer value (value) associated with the String (key)
         */
        System.out.println(map1.get("john"));
    }
}