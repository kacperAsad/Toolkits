import netscape.javascript.JSObject;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LangLoader {

    public static Map<String, String> loadLang(String pathToFile){
        return loadLang(new File(pathToFile));
    }
    public static Map<String, String> loadLang(File file) {
        if (!file.exists() || !file.isFile() || !file.canRead()){
            return null;
        }
        try (Scanner sc = new Scanner(file)){
            Map<String, String> keys = new HashMap<>();
            StringBuilder builder = new StringBuilder();
            while (sc.hasNext()){
                builder.append(sc.nextLine());
            }
            JSONObject object = new JSONObject(builder.toString());

            for (String key: object.keySet()){
                keys.put(key, object.getString(key));
            }
            return keys;
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
