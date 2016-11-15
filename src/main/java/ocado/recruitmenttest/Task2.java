package ocado.recruitmenttest;

public class Task2 {
    public int solution(int A, int B) {
        int primesNumber = 0;
        for (int i = A; i <= B; i++) {
            if (isPrime(i)) {
                primesNumber++;
            }
        }
        return primesNumber;
    }

    private boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = (int)Math.sqrt(n); i > 1; i--) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
