public class TextSearchEngine {

    private static TextSearchEngine instance;

    private TextSearchEngine() {
        new TextSearchEngine();
    }

    public static TextSearchEngine getInstance() {
        if (instance == null) {
            instance = new TextSearchEngine();
        }
        return instance;
    }

    public String[] searchTextByPattern(String text , TextSearchPattern pattern)
    {
        int matches = 0;
        text.lines().forEach((o) -> {

            for (int i = 0; i < o.length(); i++) {
                o.toCharArray()
            }
        });
    }

}
