package task_5_3_2;

public class StringManipulator {

    public String concatenate(String str1, String str2) {
        return str1 + str2;
    }

    int findLength(String str) {
        return str.length();
    }

    String convertToUpperCase(String str) {
        return str.toUpperCase();
    }

    String convertToLowerCase(String str) {
        return str.toLowerCase();
    }

    boolean containsSubstring(String str, String subStr) {
        return str.contains(subStr);
    }
}
