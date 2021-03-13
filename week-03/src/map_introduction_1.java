import com.sun.jdi.Value;

import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.util.HashMap;

public class map_introduction_1 {

    public static void main(String[] args) {


        // Create an empty map where the keys are integers and the values are characters

        HashMap<Integer, String> mapintro = new HashMap<Integer, String>();

        // Print out whether the map is empty or not

        boolean ans = mapintro.isEmpty();

        System.out.println(ans);

        // Add the following key-value pairs to the map

        mapintro.put(97 , "a");
        mapintro.put(98 , "b");
        mapintro.put(99 , "c");
        mapintro.put(65 , "A");
        mapintro.put(66 , "B");
        mapintro.put(67 , "C");

        // Print all the keys

        System.out.println(mapintro.keySet());


        // Print all the values

        System.out.println(mapintro.values());

        // Add value D with the key 68

        mapintro.put(68, "D");

        // Print how many key-value pairs are in the map

        System.out.println(mapintro.size());

        // Print the value that is associated with key 99

        System.out.println(mapintro.get(99));


        // Remove the key-value pair where with key 97

        mapintro.remove((97));

        // Print whether there is an associated value with key 100 or not

        System.out.println(mapintro.containsKey(100));

        // Remove all the key-value pairs

        mapintro.clear();

        System.out.println(mapintro);

        }
    }

