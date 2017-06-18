import java.util.ArrayList;
import java.util.List;

/* PROSPER_LEGAL_LEGEND */

/**
 * CLASS / TYPE DESCRIPTION GOES HERE.
 *
 * @author kjain
 */
public class Factors {

    private List<Integer> retrieveFactors(Integer number) {
        List<Integer> listFactors = new ArrayList<>();

        int factor = 2;
        // add the factors of 2
        while (number % factor == 0) {
            listFactors.add(factor);
            number = number / factor;
        }

        // look for other factors
        factor = 3;
        double stopAt = Math.sqrt(number);
        while (factor <= stopAt) {
            while (number % factor == 0) {
                listFactors.add(factor);
                number = number / factor;
                stopAt = Math.sqrt(number);
            }
            // increase the factors by 2 because all the multiple of already accounted for using factor 2
            factor = factor + 2;
        }

        if (number > 1) {
            listFactors.add(number);
        }
        return listFactors;
    }

    public static void main(String[] args) {
        Factors factors = new Factors();
        System.out.println(factors.retrieveFactors(204));
        System.out.println(factors.retrieveFactors(875867));
    }

}
