package lab3.task1;

public class countLetters {
    static int lettersCounting(String string) {
        int letters = 0;
        string = string.toLowerCase();
        for (int i = 0; i < string.length(); ++i) {
            char ch = string.charAt(i);
            if ((ch >= 'a' && ch <= 'z')) {
                ++letters;
            }
        }
        return letters;
    }
}
