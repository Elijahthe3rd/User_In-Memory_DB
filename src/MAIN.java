import Model.Person;

import java.util.ArrayList;
import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {

        DeleteUser delete=new DeleteUser();
        UserCRUD addUser =new UserCRUD();
        UserList userList=new UserList();

        Person user;

        Scanner scanner = new Scanner(System.in);

        String command = null;

        int options;

        String option2;

        GatherUserInfo userInfo = new GatherUserInfo();

        try {
            DisplayMenu ds = new DisplayMenu();
            System.out.println(ds.displayMenu());

            options = scanner.nextInt();
            if (options < 1) {
                System.out.println( "No Input Provided Please Choose at least 1 Option:");
                System.out.println(ds.displayMenu());
                System.out.print("Please enter select an option's Number:\n");
                options= scanner.nextInt();

            }else {

                switch (options) {
                    case 1:
                        command = "ADD";
                        addUser.addUserInfo();
                        System.out.println("");
                        break;
                    case 2:
                        command = "DELETE";
//                        userInfo.getUserData();
                        System.out.print("Please Enter user email to delete the user: ");
                        option2=scanner.next();
                        delete.deleteUsr(option2);
                        break;

                    case 3: {
                        command = "UPDATE table where email=?";
                        break;
                    }
                    case 4: {
                        command = "SELECT * FROM ";
                            userList.DisplayList(new ArrayList<>(addUser.getUserList())) ;
                        break;
                    }
                    default: {
                        System.out.println("NON VALID OPTION SELECTED!!!");
                        break;
                    }
                }
            }


        }catch(Exception ex){
            ex.getMessage();
        }
    }
    }
//}