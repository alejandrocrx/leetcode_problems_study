import java.util.Arrays;

public class MinNumChairs {
    public static void main(String[] args) {

        int[] s = { 1, 2, 6, 5, 3 };
        int[] e = { 5, 5, 7, 6, 8 };

        System.out.println(solution(s, e));
    }

    public static int solution(int[] s, int[] e) {

        Arrays.sort(s);
        Arrays.sort(e);

        int numOfPeople = 0;
        int chairs = 1;
        int p1 = 0;
        int p2 = 0;

        while (p1 < s.length) {

            if (s[p1] <= e[p2]) {
                chairs = Math.max(chairs, numOfPeople++);
                p1++;
            } else {
                numOfPeople--;
                p2++;
            }
        }

        return chairs;
    }
}
