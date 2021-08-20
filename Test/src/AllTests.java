import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class AllTests {

    // Enter point in tests
    public static void main(String[] args) {
        AllTests tests = new AllTests();
        tests.testArgsParser();
    }
    private boolean testArgsParser(){
        String[] args = new String[3];
        args[0] = "Siema;Hello";
        args[1] = "XDDD;";
        args[2] = "Hello=;World";
        ArgsParser parser = new ArgsParser(args);
        parser.setArgsType(ArgsParser.ListType);
        List<String> mapValues = parser.getListfromArgs();

        System.out.println(mapValues);
        System.out.println(Arrays.toString(args));
        return true;
    }




}
