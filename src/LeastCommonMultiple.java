/* PROSPER_LEGAL_LEGEND */

/**
 * CLASS / TYPE DESCRIPTION GOES HERE.
 *
 * @author kjain
 */
public class LeastCommonMultiple {

    // lcm = a*b/gcd(a,b) ;

    //Euclid algorithm to calculate gcd
    private Integer findGCD(Integer a, Integer b) {
        while (b != 0) {
            int remainder = a % b;
            a = findGCD(b, remainder);
            b = remainder;
        }

        return a;
    }

    private Integer calculateLCM(Integer a, Integer b) {
        Integer greatestCommonDivisor = findGCD(a, b);
        Integer lcm = a / greatestCommonDivisor * b;
        return lcm;
    }

    public static void main(String[] args) {
        LeastCommonMultiple leastCommonMultiple = new LeastCommonMultiple();
        System.out.println(leastCommonMultiple.calculateLCM(10000000, 2000000));
        System.out.println(leastCommonMultiple.calculateLCM(100000000, 2000000));
    }

}
