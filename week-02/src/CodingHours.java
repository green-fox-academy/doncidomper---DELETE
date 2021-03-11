public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52

        int d = 6;
        double w = 17;
        int wd = 5;
        double wh = 52;
        double cdhs = ((d * wd)*w);

        System.out.println( "Coding hours/semester: " + (d*wd)*w);
        System.out.println( "Coding hour percentage: " + (cdhs/(w*wh)) * 100 );

    }



}
