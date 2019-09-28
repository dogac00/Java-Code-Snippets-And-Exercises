class PalindromeHelper {
    static String longestPalindrome(final String str) {

        int longestJ = 0, longestI = 0;
        final int length = str.length();

        for (int i = 0; i < length; i++) {
            for (int j = length - 1; j > i; j--) {
                if (j - i > longestJ - longestI && isPalindrome(str, i, j)) {
                    longestJ = j;
                    longestI = i;
                }
            }
        }

        return str.substring(longestI, longestJ + 1);
    }

    private static boolean isPalindrome(String str, int start, int end) {
        while (start < end) {
            if (str.charAt(start++) != str.charAt(end--)) return false;
        }

        return true;
    }
}
