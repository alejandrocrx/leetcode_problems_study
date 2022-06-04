import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {
    public static void main(String[] args) {
        /*
         * Given a string containing digits from 2-9 inclusive, return all possible
         * letter combinations that the number could represent. Return the answer in any
         * order.
         * 
         * A mapping of digit to letters (just like on the telephone buttons) is given
         * below. Note that 1 does not map to any letters.
         * 
         * Input: digits = "23" Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
         */
        System.out.println(letterCombinations("23"));
    }

    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        String[] map = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

        if (digits != null) {
            dfs(result, map, digits, new StringBuilder(), 0);
        }

        return result;
    }

    public static void dfs(List<String> result, String[] map, String digits, StringBuilder sb, int index) {
        if (index == digits.length()) {
            result.add(sb.toString());
            return;
        }
        int digit = Character.getNumericValue(digits.charAt(index));
        String letters = map[digit];

        for (int i = 0; i < letters.length(); i++) {
            char ch = letters.charAt(i);
            sb.append(ch);
            dfs(result, map, digits, sb, index + 1);
            sb.deleteCharAt(sb.length() - 1);
        }

    }
}
