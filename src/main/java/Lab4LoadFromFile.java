import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

public class Lab4LoadFromFile {
    public static User load() throws IOException {
        User user = null;
        String bankStr = "";
        File file = new File("persons.json");

        if (file.exists()) {
            bankStr = new String(Files.readAllBytes(file.toPath()));
        }

        user = new Gson().fromJson(bankStr, User.class);

        return user;
    }

    /**
     * Пример чтения из файла массива JSON объектов
     */
    public static List<User> loadShopList() throws IOException, JsonSyntaxException {
        String pStr = "";
        File file = new File("persons.json");

        if (file.exists()) {
            pStr = new String(Files.readAllBytes(file.toPath()));
        } else {
            System.out.println("File persons.json not found!");
        }

        Gson gson = new Gson();

        User[] users = gson.fromJson(pStr, User[].class);

        return Arrays.asList(users);

    }
}
