/* PROSPER_LEGAL_LEGEND */

/**
 * CLASS / TYPE DESCRIPTION GOES HERE.
 *
 * @author kjain
 */
public class LeastCongruentialGenerator {

    //

    // Xn+1 = Xn*A + B (Mod M)

    private Long initialNumber;
    private Long firstConstantA;
    private Long secondConstantB;
    private Long modNumberM;
    private Long lastGeneratedNumber;

    public LeastCongruentialGenerator(Long initialNumber, Long firstConstantA, Long secondConstantB, Long modNumberM) {
        this.initialNumber = initialNumber;
        this.firstConstantA = firstConstantA;
        this.secondConstantB = secondConstantB;
        this.modNumberM = modNumberM;
        this.lastGeneratedNumber = initialNumber;
    }
    
    public Long generateRandomNumber() {
        lastGeneratedNumber = ((lastGeneratedNumber * this.firstConstantA) + secondConstantB) % this.modNumberM;
        return lastGeneratedNumber;
    }
    
    public static void main(String[] args) {
        LeastCongruentialGenerator leastCongruentialGenerator = new LeastCongruentialGenerator(0l,5l,3l,7l);
       System.out.println(leastCongruentialGenerator.generateRandomNumber());
        System.out.println(leastCongruentialGenerator.generateRandomNumber());
        System.out.println(leastCongruentialGenerator.generateRandomNumber());
        System.out.println(leastCongruentialGenerator.generateRandomNumber());
        System.out.println(leastCongruentialGenerator.generateRandomNumber());
        System.out.println(leastCongruentialGenerator.generateRandomNumber());
        System.out.println(leastCongruentialGenerator.generateRandomNumber());
        System.out.println(leastCongruentialGenerator.generateRandomNumber());
    }
    

}
