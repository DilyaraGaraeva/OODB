import java.io.IOException;
import java.util.List;

public class Lab2Main {
    public static void main(String[] args) {
        try {

            List<User> users = Lab2LoadDB.loadPersonList();

            users.forEach(System.out::println);

            User prs = UserService.findUserByName(users, "name2");

            if (prs != null) {
                prs.setPhoneNumber("+71111111111");
                prs.setEmail("ivan@mail.ru");
            }

            /*List<User> persons = new ArrayList<>();
            persons.add(new User("name", "name", "894756574", "mfmg@mail.ru"));
            persons.add(new User("name2", "name2", "896454756574", "mf3werr@mail.ru"));*/

            Lab2SaveDB.savePersonList(users);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
