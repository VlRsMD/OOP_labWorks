package lab3.task1;

public class longestWord {
    public static String getLongestWord(String[] array) {
        int maxLength = 0;
        String theLongestWord = null;
        for (String s : array) {
            if (s.length() > maxLength) {
                maxLength = s.length();
                theLongestWord = s;
            }
        }
        return theLongestWord;
    }
}
