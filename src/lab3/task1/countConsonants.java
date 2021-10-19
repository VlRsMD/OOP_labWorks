package lab3.task1;

public class countConsonants {
    static int consonantsCounting(String string) {
        int vowels = 0, consonants = 0;
        string = string.toLowerCase();
        for (int i = 0; i < string.length(); ++i) {
            char ch = string.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                ++vowels;
            } else if ((ch >= 'a' && ch <= 'z')) {
                ++consonants;
            }
        }
        return consonants;
    }
}
