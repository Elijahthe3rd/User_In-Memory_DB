import Model.Person;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class DeleteUser {

    public boolean deleteUsr(String email) {
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
        if (listSize == 0) {
            System.out.println("List is empty consider adding users first.");
            String answer = null;

            do {

                System.out.println("would you like to add users?:Y/N");
                Scanner sc = new Scanner(System.in);
                answer=sc.next();
                answer = answer.toString().toLowerCase();

                if (answer.equalsIgnoreCase( "no") || answer.equalsIgnoreCase("n")) {
                    break;
                } else if(answer.equalsIgnoreCase( "yes") || answer.equalsIgnoreCase("y")) {

                    switch (answer) {
                        case "y":
                        case "yes":
                            userCRUD.addUserInfo();
                            userCRUD.getUserList();

                            continue;
                        case "n":
                        case "no":
                            System.out.println("List is Empty can't not delete successfully. \nGood Bye...");
                            continue;
                        default:
                            System.out.println("exiting...");
                            break;
                    }
                }
            } while (answer.equalsIgnoreCase(null)||answer.equalsIgnoreCase("no"));
        } else if (listSize > 0) {
            System.out.println("warning, removing user:");
            userCRUD.getUserList().removeIf((Predicate<? super Person>) userCRUD.getUserList().stream().filter(x -> x.getEmail().equals(email)));
            System.out.println("User with email" + email + " was successfully Deleted");
        }
        return msg.equals(msg2);
    }
}
