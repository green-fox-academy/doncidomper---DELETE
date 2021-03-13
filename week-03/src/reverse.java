public class reverse {

    public static void main(String... args){
        String toBeReversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";



        // Create a method that can reverse a String which is passed as parameter
        // Pass the toBeReversed variable to this method to check if it works well
        // Solve this task using charAt() function first
        // Try other solutions when you are done


        String ReversedString = "";

        for (int i = toBeReversed.length()-1; i>=0 ; i--){

            ReversedString = ReversedString + toBeReversed.charAt(i);

        }

        System.out.println(ReversedString);



        // StringBuilder stringBuilder = new StringBuilder(toBeReversed);

        // stringBuilder = stringBuilder.reverse();

        // System.out.println(stringBuilder);






    }


}
