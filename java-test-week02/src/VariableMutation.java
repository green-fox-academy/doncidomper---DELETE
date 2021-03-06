public class VariableMutation {

    public static void main(String[] args) {
        int a = 3+10;
        // make the "a" variable's value bigger by 10

        System.out.println(a);

        int b = 100-7;
        // make b smaller by 7

        System.out.println(b);

        int c = 44*2;
        // please double c's value

        System.out.println(c);

        int d = 125/5;
        // please divide by 5 d's value

        System.out.println(d);

        int e = 8^3;
        // please cube of e's value

        System.out.println(e);

        int f1 = 123;
        int f2 = 345;


            boolean biggerF = f2<f1;
        System.out.println("f2 < f1 " + biggerF );

        // tell if f1 is bigger than f2 (print as a boolean)

        int g1 = 350;
        int g2 = 200;
        // tell if the double of g2 is bigger than g1 (print as a boolean)
            boolean biggerG= g1<(g2*2);
        System.out.println("g2 * 2 < g1 " + biggerG);


        int h = 135798745;
        // tell if it has 11 as a divisor (print as a boolean)

        boolean hisDivisibleBy11 = h % 11 == 0;

        System.out.println("h is divisible by 11: " + hisDivisibleBy11);

        int i1 = 10;
        int i2 = 3;
        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)

        boolean higher = i1 > (i2^2);
        System.out.println("i1 > i2^2: " + higher );
        boolean smaller = i1 < (i2^3);
        System.out.println("i1 < i2^3  " + smaller );

        int j = 1521;
        // tell if j is dividable by 3 or 5 (print as a boolean)

        boolean jisDivisibleBy35 = (j % 3 == 0 || j % 5 == 0);
        System.out.println("j is divisible by 3 or 5: " + jisDivisibleBy35 );



    }

}
