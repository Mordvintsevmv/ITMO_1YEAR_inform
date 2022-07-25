package Dictionary;

public class ChechDictionaryFactory implements DictionaryFactory{

    @Override
    public Dictionary getDictionary() {
        return new ChechDictionary();
    }
}