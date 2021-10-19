package lab3.task1;

public class sentenceCount {
    static int countingSentences(String string) {
        String sentenceDelimiters = "!.?";
        int sentencesCounting = 0;
        for (int i = 0; i < string.length() - 1; i ++) {
            if (sentenceDelimiters.indexOf(string.charAt(i)) != -1 && i > 0 &&  sentenceDelimiters.indexOf(string.charAt(i - 1)) != -1) {
                sentencesCounting ++;
            }
        }
        return sentencesCounting;
    }
}
