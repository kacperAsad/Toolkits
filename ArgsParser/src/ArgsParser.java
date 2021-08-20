import java.io.File;
import java.util.*;


public class ArgsParser {

    public static final String ListType = "ListType";              // arguments return type
    public static final String MapType = "MapType";                // arguments return type
    public static final char MapCharKeyBreaker = '=';              // splits a pair in key-value
    public static final char MapCharBreaker = ';';                 // splits a one strings into pairs
    public static final char ListSeparator = ';';                  // splits args to list words

    private String finalType;


    String[] mainArgs;

    public ArgsParser(String[] args)
    {
        mainArgs = args;
    }

    public void setArgsType(String argsType)
    {
        if (argsType.equalsIgnoreCase(ListType))
        {
            finalType = ListType;
        }else if (argsType.equalsIgnoreCase(MapType))
        {
            finalType = MapType;
        }
    }
    // TODO: Dokończyć + dodać wyjątki

    /**
     * Method that generate a map contains a set of key-pair values formatted from String[] or String... object.
     * Syntax of the String is so basic, first string is a key, next is equals sign and next of this is second string. If you want put more pairs, end this with ;
     * Example:
     *      "Key1=Value1;LastKey=LastValue"
     * In this, it's not important how the string looks. This can be a mixed string.
     * Example:
     *      "Key1=Value1;", "Key2=Value2"
     *      "Key1=", "Value1;", "Key2", "=Value2"
     * It's working on contacting all strings in one piece and split it in ';'
     * If one of the strings is bad formatted, method returns null instead map
     *
     * @return Map, that contains the formatted data
     */
    public Map<String , String> getMapfromArgs()
    {
        if (!finalType.equalsIgnoreCase(MapType))  // if type defined above is not the same, returning null
        {
            return null;
        }
        StringBuilder buffer = new StringBuilder();
        for (String mainArg : mainArgs) {
            buffer.append(mainArg);
        }
        String[] pairs = buffer.toString().split(String.valueOf(MapCharBreaker));
        Map<String , String> pairsMap = new HashMap<>();
        for (String pair : pairs) {
            String[] par = pair.split(String.valueOf(MapCharKeyBreaker));
            if (par.length == 2) {
                pairsMap.put(par[0], par[1]);
            }else
            {
                return null;
            }
        }
        return pairsMap;
    }

    public List<String> getListfromArgs(){
        if (!finalType.equalsIgnoreCase(ListType)){
            return null;
        }
        StringBuilder builder = new StringBuilder();
        for (String w: mainArgs){
            w = w.replaceAll(" ", "");
            if (w.equalsIgnoreCase(""))
            builder.append(w);
        }
        String[] list = builder.toString().split(String.valueOf(ListSeparator));

        return Arrays.asList(list);
    }

}
