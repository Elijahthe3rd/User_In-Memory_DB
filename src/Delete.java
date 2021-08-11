import Model.Person;

import java.util.ArrayList;
import java.util.Properties;
import java.util.function.Predicate;

public class Delete {

    public static boolean deleteUsr(String email) {
        boolean response = false;
        UserCRUD userCRUD = new UserCRUD();
        ArrayList<Person> list = new ArrayList<Person>(userCRUD.getUserList());
        int listSize = list.size();
        int input = 0;
        StringBuilder msg = null;
        StringBuilder msg2 = msg;
        GatherUserInfo userList = new GatherUserInfo();
//        System.out.println(userCRUD.getUserList().size());
        System.out.println("EXECUTING CLASS: " + (DeleteUser.class.getName()));
        Properties props =new Properties();
//        props.getProperty()
        if (listSize > 0) {
            System.out.println("warning, removing user:");
            userCRUD.getUserList().removeIf((Predicate<? super Person>) userCRUD.getUserList().stream().filter(x -> x.getEmail().equals(email)));
            System.out.println("User with email" + email + " was successfully Deleted");
        }else{
            throw new IllegalArgumentException("Database is empty");
        }
        return msg.equals(msg2);
    }
}
