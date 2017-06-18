/* PROSPER_LEGAL_LEGEND */

/**
 * CLASS / TYPE DESCRIPTION GOES HERE.
 *
 * @author kjain
 */
public class GreatestCommonDivisor {

    //Euclid algorithm to calculate gcd
    private Integer calculateGCD(Integer a, Integer b) {
        while (b != 0) {
            Integer remainder = a % b;
            a = calculateGCD(b, remainder);
            b = remainder;
        }
        return a;
    }
    
    public static void main(String[] args) {
        GreatestCommonDivisor gcd = new GreatestCommonDivisor();
        System.out.println(gcd.calculateGCD(987652436,12345));
    }

}
