import java.util.Arrays;
import java.util.Map;

public class AllTests {

    // Enter point in tests
    public static void main(String[] args) {
        AllTests tests = new AllTests();
    }
    private boolean testArgsParser(){
        String[] args = new String[3];
        args[0] = "Test1=Test1;";
        args[1] = "Test2=Test2;";
        args[2] = "Hello=World";
        ArgsParser parser = new ArgsParser(args);
        parser.setArgsType(ArgsParser.MapType);
        Map<String, String> mapValues = parser.getMapfromArgs();

        System.out.println(mapValues);
        System.out.println(Arrays.toString(args));
        return true;
    }




}
