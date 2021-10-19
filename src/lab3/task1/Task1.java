package lab3.task1;

public class Task1 {
    public final void main(String[] args) {
        // 1st task:
        String hugeText = "World War 1 Changed the face of Europe and the Middle East like at no other time before or since. Both the 400 plus year old Austro Hungarian and the Islamic Ottoman Empires ceased to exist. Germany became much smaller loosing much of East Prussia which was given back to the Poles. The majority of British school children of today would not even recognize these names. In the Middle East new countries were created by the conquering powers England and France with the blessing of the League of Nations; including Iraq, Syria, Jordan, modern Saudi Arabia and eventually Israel.\n" +
                "\n" +
                "The Russian Empire also collapsed. The Russians faired so badly that the citizens of St Petersburg starved so the peasants plus the Bourgeoisie (intellectual middle class and businessmen), who had suffered such terrible casualties, revolted, assassinated the King (Tsar) and created a socialist  republic under the Communist leader Vladimir  Lenin.  The beaten Germans were forced by France to pay for the war which ruined their economy and caused Germany to rise again and occupy France only 20 years later in the so called Second World War.";
        System.out.println("The number of words in the text is" + wordCount.countingWords(hugeText));
        System.out.println("The number of sentences in the text is" + sentenceCount.countingSentences(hugeText));

        // 2nd task:
        System.out.println("The number of letters in the text is" + countLetters.lettersCounting(hugeText));
        System.out.println("The number of vowels in the text is" + countVowels.vowelsCounting(hugeText));
        System.out.println("The number of consonants in the text is" + countConsonants.consonantsCounting(hugeText));

        // 3rd task:
        // top 5 used words:
        String[] words = hugeText.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("[^\\w]", "");
        }
        topUsedWords.usedWords(words);
        // longest word:
        System.out.println("The longest word is" + longestWord.getLongestWord(words));
    }
}
