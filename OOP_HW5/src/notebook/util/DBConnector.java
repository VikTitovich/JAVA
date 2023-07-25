package notebook.util;

import java.io.File;

public class DBConnector {
    public static final String DB_PATH = "db.txt";
    public static void createDB() {
        try {
            File db = new File(DB_PATH);
            if (db.createNewFile()) {
                System.out.println("DB Created");
            }
            else {
                System.out.println("DB Already Exists");
            }
        }
        catch (Exception e) {
            System.err.println(e);
        }
    }
}
