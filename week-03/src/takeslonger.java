public class takeslonger {

    public static void main(String... args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occurred. Please fix it!
        // Insert the words "always takes longer than" between the words "It" and "you" using the StringBuilder class!
        // Use pieces of the quote variable (instead of just redefining the string)!

        String sent1 = quote.substring(0 , 20);
        String sent2 = quote.substring(21 , quote.length());

        String full = sent1 + " always takes longer than " + sent2 ;



        System.out.println(full);
    }


}
