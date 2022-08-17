import java.util.HashSet;
import java.util.Set;

public class MinDominoRotations4EqualRow {
    public static void main(String[] args) {

        int[] tops = { 2, 1, 2, 4, 2, 2 };
        int[] bottoms = { 5, 2, 6, 2, 3, 2 };

        System.out.println(minDominoRotations(tops, bottoms));

    }

    public static int minDominoRotations(int[] tops, int[] bottoms) {

        int n = tops.length;

        int[] topsCount = new int[7];
        int[] bottomsCount = new int[7];
        int[] same = new int[7];

        for (int i = 0; i < n; ++i) {
            topsCount[tops[i]]++;
            bottomsCount[bottoms[i]]++;
            if (tops[i] == bottoms[i]) {
                same[tops[i]]++;
            }
        }

        // System.out.print("Tops Count: ");
        // for (Integer i : topsCount) {
        // System.out.print(i + " ");
        // }
        // System.out.print("\nBottoms Count: ");
        // for (Integer i : bottomsCount) {
        // System.out.print(i + " ");
        // }
        // System.out.print("\nSame Count: ");
        // for (Integer i : same) {
        // System.out.print(i + " ");
        // }

        for (int i = 1; i < n; ++i) {
            if (topsCount[i] + bottomsCount[i] - same[i] == n) {
                return n - Math.max(topsCount[i], bottomsCount[i]);
            }
        }
        return -1;
    }
}
