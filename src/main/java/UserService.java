import java.util.List;

public class UserService {
    /**
     * Поиск по имени
     */
    public static User findUserByName(List<User> users, String searchName) {
        User result = null;

        for (User user : users) {
            if (user.getFirstName().equals(searchName)) {
                result = user;
            }
        }

        return result;
    }


}
