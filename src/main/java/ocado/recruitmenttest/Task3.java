package ocado.recruitmenttest;

public class Task3 {
    public int solution(int Q) {
        int qRoundPairs = 0;
        if (Q == 0) {
            return 1;
        }
        for (int i = (int) Math.sqrt(Q); i > 0; i--) {
            if (i * i == Q) {
                qRoundPairs += 4;
            }
            int j = Q - i * i;
            if (hasSquareRoot(j)) {
                qRoundPairs += 4;
            }
        }
        return qRoundPairs;
    }

    private boolean hasSquareRoot(int n) {
        int sqrt = (int) (Math.sqrt(n));
        return n != 0 && sqrt * sqrt == n;
    }

    public static void main(String[] args) {
        Task3 task3 = new Task3();
        System.out.println(task3.solution(25));
        System.out.println(task3.solution(0));
        System.out.println(task3.solution(1));
        System.out.println(task3.solution(2));
        System.out.println(task3.solution(3));
        System.out.println(task3.solution(9));
        System.out.println(task3.solution(8));
    }
}
