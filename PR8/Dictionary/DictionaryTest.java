package Dictionary;

public class DictionaryTest {
    public static void main(String[] args) {

        Dictionary polish =  new PolishDictionaryFactory().getDictionary();
        polish.translateWord("kochać");
        polish.translateWord("1234");

        Dictionary chech =  new ChechDictionaryFactory().getDictionary();
        chech.translateWord("jíst");

        Dictionary german =  new GermanDictionaryFactory().getDictionary();
        german.translateWord("Alptraum");
    }
}