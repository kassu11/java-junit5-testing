package task_5_4_1;

import java.util.Arrays;

public class PalindromeChecker {
    public boolean isPalindrome(String text) {
        text = text.replace("!", "");
        text = text.replace("?", "");
        text = text.replace(".", "");
        text = text.replace(",", "");
        text = text.replace(";", "");
        text = text.replace(" ", "");
        text = text.replace("\"", "");
        text = text.replace("'", "");
        text = text.replace(":", "");
        text = text.replace("-", "");
        text = text.toLowerCase();

        String reversed = new StringBuilder(text).reverse().toString();

        return text.equals(reversed);
    }
}
