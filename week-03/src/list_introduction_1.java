import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class list_introduction_1 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        // Print out the number of elements in the list

        int numberofelements = list.size();
        System.out.println(numberofelements);

        // Add William to the list

        list.add("William");

        // Print out whether the list is empty or not

        boolean ans = list.isEmpty();
        System.out.println(ans);

        // Add John to the list
        //Add Amanda to the list

        list.add("John");
        list.add("Amanda");

        // Print out the number of elements in the list

        int numberofelements2 = list.size();

        System.out.println(numberofelements2);

        // Print out the 3rd element

        System.out.println(list.get(2));

        // Iterate through the list and print out each name

        for (int i = 0 ; i < list.size(); i++ ){

        System.out.println(list.get(i));}

        // Iterate through the list and print

        System.out.println("1. " + list.get(0));
        System.out.println("2. " + list.get(1));
        System.out.println("3. " + list.get(2));

        // Remove the 2nd element

        list.remove(1);

        // Iterate through the list in a reversed order and print out each name

        for (int i = list.size()-1; i >= 0; i-- ) {

            System.out.println(list.get(i));

        }

        // Remove all elements

        for (int x = list.size()-1; x >= 0; x-- ){
            list.remove(x);

        }

        System.out.println(list);


    }
}