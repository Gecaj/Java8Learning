package codility;

/**
 * Created by cislo on 11/8/16.
 */
public class OddOccurencesInArray {

    public int solution(int[] A) {
        int unpaired = 0;
        for (int i : A) {
            unpaired ^= i;
        }
        return unpaired;
    }

    public static void main(String[] args) {
        OddOccurencesInArray oddOccurencesInArray = new OddOccurencesInArray();
        System.out.println(oddOccurencesInArray.solution(new int[]{1,2,3,4,3,2,1}));
    }

}
