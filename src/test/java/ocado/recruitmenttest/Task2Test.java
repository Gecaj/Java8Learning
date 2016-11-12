package ocado.recruitmenttest;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Task2Test {

    private Task2 primes = new Task2();

    @Test
    public void shouldCheckSolutionCorrectly() {
        assertThat(primes.solution(1, 60)).isEqualTo(18);
        assertThat(primes.solution(11, 19)).isEqualTo(4);
    }
}
