package codility;

/**
 * Created by cislo on 11/9/16.
 */
public class FrogJmp {
    public int solution(int X, int Y, int D) {
        return (int)Math.ceil((Y-X)/(double)D);
    }
}
