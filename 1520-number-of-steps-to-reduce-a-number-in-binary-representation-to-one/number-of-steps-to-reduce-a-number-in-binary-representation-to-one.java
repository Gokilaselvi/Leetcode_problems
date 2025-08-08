import java.math.BigInteger;

class Solution {
    public int numSteps(String s) {
        BigInteger val = new BigInteger(s, 2);
        int count = 0;

        while (!val.equals(BigInteger.ONE)) {
            if (val.mod(BigInteger.TWO).equals(BigInteger.ZERO)) {
                // Even → divide by 2
                val = val.divide(BigInteger.TWO);
            } else {
                // Odd → add 1
                val = val.add(BigInteger.ONE);
            }
            count++;
        }

        return count;
    }
}
