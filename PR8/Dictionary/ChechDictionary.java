package Dictionary;

import java.util.HashMap;

public class ChechDictionary implements Dictionary{
    private HashMap<String, String> dict;

    public ChechDictionary() {
        this.dict = new HashMap<>();
        this.dict.put("milovat", "люблю");
        this.dict.put("jíst", "кушать");

    }

    @Override
    public boolean translateWord(String word) {
        String translatedWord = dict.get(word);
        if (translatedWord != null) {
            System.out.println(String.format("Перевод слова "+ word + " -- " +  translatedWord));
            return true;
        }
        return false;
    }
}