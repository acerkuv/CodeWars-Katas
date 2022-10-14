public class CountOfDivisions {
    public static void main(String[] args) {
        System.out.println(numberOfDivisors(30));

    }
    public static long numberOfDivisors(int n) {
        // https://www.codewars.com/kata/542c0f198e077084c0000c2e/train/java
        long count = 0;
        for (int i = 1; i <= n; i++){
            if (isDiv(n, i)) count++;
        }
        return count;
    }
    public static boolean isDiv(int n, long d){
        if (n % d == 0) return true;
        return false;
    }
}
