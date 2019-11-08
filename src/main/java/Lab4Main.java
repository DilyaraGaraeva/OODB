import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class Lab4Main {
    public static void main(String[] args) {

        try {

            Class.forName("org.postgresql.Driver");
            String dbURL = "jdbc:postgresql://localhost:5432/oodb";
            Connection connection =
                    DriverManager.getConnection( dbURL, "postgres", "lehf12");

            Lab4LoadFromDb.loadUserList(connection);

            List<User> users = Lab4LoadFromFile.loadShopList();

            users.forEach(System.out::println);

            User usr = UserService.findUserByName(users, "Иван");

            if (usr != null) {
                usr.setPhoneNumber("+71111111111");
                usr.setEmail("ivan@mail.ru");
            }


            Lab4SaveDB.savePersonList(users, connection);


            connection.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
