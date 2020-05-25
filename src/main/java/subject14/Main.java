package subject14;

/**
 * 14. 最长公共前缀
 * <p>
 * 题目链接: https://leetcode-cn.com/problems/longest-common-prefix/
 *
 * @author xl
 */
public class Main {

    private static final String[] testStringArray1 = new String[]{"flower", "flow", "flight"};
    private static final String[] testStringArray2 = new String[]{"dog", "racecar", "car"};

    public static void main(String[] args) {
        String result1 = new Solution().longestCommonPrefix(testStringArray1);
        System.out.println(result1);
        String result2 = new Solution().longestCommonPrefix(testStringArray2);
        System.out.println(result2);

    }

}

class Solution {
    public String longestCommonPrefix(String[] strs) {

        return null;
    }
}