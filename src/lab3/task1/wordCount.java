package lab3.task1;

public class wordCount {
    static int countingWords(String string) {
        int count = 0;

        char[] ch = new char[string.length()];
        for(int i = 0; i < string.length(); i ++)
        {
            ch[i] = string.charAt(i);
            if(((i > 0) && (ch[i] != ' ') && (ch[i-1] == ' ')) || ((ch[0] != ' ') && (i == 0)) )
                count ++;
        }
        return count;
    }
}
