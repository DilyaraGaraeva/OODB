import com.google.gson.Gson;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class Lab4SaveDB {
    public static void savePersonList(List<User> persons, Connection connection) throws SQLException {

        if (persons != null && persons.size() > 0) {
            Gson gson = new Gson();

            String personsAsJson = gson.toJson(persons);
//приведение одного типа к другому
            PreparedStatement statement = connection.
                    prepareStatement("insert into usr (content, contentb) values ( cast( ? as json) , cast( ? as jsonb) )");
            statement.setString(1, personsAsJson);
            statement.setString(2, personsAsJson);

            int count = statement.executeUpdate();

            System.out.println(count + " records added!");

            statement.close();

        }
    }
}
