package Dictionary;

import java.util.HashMap;

public class PolishDictionary implements Dictionary {
    private HashMap<String, String> dict;

    public PolishDictionary() {
        this.dict = new HashMap<>();
        this.dict.put("zjadac", "кушать");
        this.dict.put("kochać", "люблю");


    }

    @Override
    public boolean translateWord(String word) {
        String translatedWord = dict.get(word);
        if (translatedWord != null) {
            System.out.println(String.format("Перевод слова %s -- %s", word, translatedWord));
            return true;
        }
        return false;
    }
}