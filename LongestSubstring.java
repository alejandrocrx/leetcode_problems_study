import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class LongestSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";

        System.out.println(num2(s));
        System.out.println(lengthOfLongestSubstring2(s));

    }

    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<Character>();
        int left = 0;
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            while (set.contains(c)) {
                set.remove(s.charAt(left++));
            }

            set.add(c);
            max = Math.max(max, i - left + 1);
        }

        return max;
    }

    public static int lengthOfLongestSubstring2(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int start = 0;
        int end = 0;
        int max = 0;

        while (end < s.length()) {
            map.put(s.charAt(end), map.getOrDefault(s.charAt(end), 0) + 1);

            if (map.size() == end - start + 1) {
                max = Math.max(max, end - start + 1);
                end++;
            }

            else if (map.size() < end - start + 1) {
                while (map.size() < end - start + 1) {
                    map.put(s.charAt(start), map.get(s.charAt(start)) - 1);

                    if (map.get(s.charAt(start)) == 0) {
                        map.remove(s.charAt(start));
                    }
                    start++;
                }
                end++;
            }
        }

        return max;
    }

    public static int num2(String s) {
        int max = 0;
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // keep deleting the element at 0 from the list
            // until c is not contained on the list
            while (list.contains(c)) {
                list.remove(0);
            }
            list.add(c);
            max = Math.max(max, list.size());

        }
        return max;
    }
}
