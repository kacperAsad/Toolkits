import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class ArgsParser {

    public static final String charExtended = "charExtended";
    public static final String MapType = "MapType";
    public static final char MapCharKeyBreaker = '=';
    public static final char MapCharBreaker = ';';

    private String finalType;


    String[] mainArgs;

    public ArgsParser(String[] args)
    {
        mainArgs = args;
    }

    public void setArgsType(String argsType)
    {
        if (argsType.equalsIgnoreCase(charExtended))
        {
            finalType = charExtended;
        }else if (argsType.equalsIgnoreCase(MapType))
        {
            finalType = MapType;
        }
    }

    public Map<String , String> getMapfromArgs()
    {
        if (!finalType.equalsIgnoreCase(MapType))
        {
            return null;
        }
        String buffer = "";
        for (String mainArg : mainArgs) {
            buffer.concat(mainArg);
        }
        String[] pairs = buffer.split(String.valueOf(MapCharBreaker));
        Map<String , String> pairsMap = new HashMap<>();
        for (String pair : pairs) {
            String[] par = pair.split(String.valueOf(MapCharKeyBreaker));
            pairsMap.put(par[0] , par[1]);
        }



        return pairsMap;
    }

}
