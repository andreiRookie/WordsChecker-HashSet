import java.util.*;

public class WordsChecker {

    private String text;
    private Set<String> setOfWords = new HashSet<>();
    private boolean isSetOfWordsRetrieved;

    public WordsChecker(String text) {
        this.text = text;
    }

    public boolean hasWord(String word) {
        if (!isSetOfWordsRetrieved) {
            retrieveSetOfWords();
        }

        if (setOfWords.contains(word)) {
            return true;
        }
        return false;
    }

    private void retrieveSetOfWords() {
        if (!isSetOfWordsRetrieved) {
            String[] words = text.split("\\P{IsAlphabetic}+");
            this.setOfWords.addAll(Arrays.asList(words));
//            for (String txt : words) {
//                this.setOfWords.add(txt);
//            }
            isSetOfWordsRetrieved = true;
        }
    }

    public String getText() {
        return text;
    }
}
