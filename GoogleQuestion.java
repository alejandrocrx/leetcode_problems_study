import java.util.ArrayList;
import java.util.TreeMap;

public class GoogleQuestion {
    public static void main(String[] args) {

        int[] input = { 5, 4, 3, 6, 1 };

        System.out.println(solution(input));

    }

    public static int solution(int[] students) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int index = 0;
        int n = students.length;
        boolean y = false;

        while (index < n) {
            y = false;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) > students[index]) {
                    list.set(i, students[index]);
                    y = true;
                    break;
                }
            }

            if (!y) {
                list.add(students[index]);
            }
            index++;
        }

        for (Integer i : list) {
            System.out.print(i + " ");
        }
        System.out.println("");
        return list.size();

    }
}