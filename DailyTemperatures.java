import java.util.Stack;

public class DailyTemperatures {
    public static void main(String[] args) {
        /*
         * Given an array of integers temperatures represents the daily temperatures,
         * return an array answer such that answer[i] is the number of days you have to
         * wait after the ith day to get a warmer temperature. If there is no future day
         * for which this is possible, keep answer[i] == 0 instead.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: temperatures = [73,74,75,71,69,72,76,73] Output: [1,1,4,2,1,1,0,0]
         */

    }

    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();

        int[] answer = new int[temperatures.length];

        for (int i = temperatures.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && temperatures[i] >= temperatures[st.peek()]) {
                st.pop();
            }

            if (!st.isEmpty()) {
                answer[i] = st.peek() - i;
            }

            st.push(i);
        }

        return answer;
    }
}
