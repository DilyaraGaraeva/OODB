import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

public class Lab4LoadFromDb {
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
    public static List<User> loadUserList(Connection connection) throws JsonSyntaxException, SQLException {
        String pStr = "";

        PreparedStatement statement =
                connection.prepareStatement("select contentb from usr ");

        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {
            pStr = resultSet.getString("contentb");
            System.out.println(pStr);
        }

        statement.close();

        Gson gson = new Gson();

        User[]users = gson.fromJson(pStr, User[].class);


        statement =
                connection.prepareStatement("select contentb->0 as c from usr ");

        resultSet = statement.executeQuery();

        while (resultSet.next()) {
            pStr = resultSet.getString("c");
            System.out.println(pStr);
        }

        return Arrays.asList(users);
    }
}
