package mr.cell;

import java.math.BigInteger;

public class PrimeNumberVerifier {
                 
    public static void main( String[] args ) {
        PrimeNumberVerifier primeNumberVerifier = new PrimeNumberVerifier();
        boolean result = primeNumberVerifier.isPrime(new BigInteger("13234975"));
        System.out.println("result: " + result);
    }

    public boolean isPrime(BigInteger n) {
        boolean result = true;
        for (int i = 0; i < 100 ; i++) {
            result &= isPrimeInternal(n.add(BigInteger.valueOf(i)));
        }
        return result;
    }

    private boolean isPrimeInternal(BigInteger n) {
        BigInteger counter = BigInteger.ONE.add(BigInteger.ONE);
        boolean isPrime = true;
        while (counter.compareTo(n) == -1) {
            if (n.remainder(counter).compareTo(BigInteger.ZERO) == 0) {
                isPrime = false;
                break;
            }
            counter = counter.add(BigInteger.ONE);
        }
        return isPrime;
    }
}
