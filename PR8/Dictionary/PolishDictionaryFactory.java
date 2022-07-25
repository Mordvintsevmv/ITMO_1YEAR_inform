package Dictionary;

public class PolishDictionaryFactory implements DictionaryFactory {
    @Override
    public Dictionary getDictionary() {
        return new PolishDictionary();
    }
}