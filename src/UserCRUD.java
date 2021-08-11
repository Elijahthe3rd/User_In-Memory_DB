import Model.Person;

import java.util.ArrayList;
import java.util.List;

public class UserCRUD {


    GatherUserInfo getInfo = new GatherUserInfo();

    ArrayList<Person> userList = new ArrayList<>();

    public void addUserInfo() {
        List<Person> cloner = getInfo.getUserData();
        userList = new ArrayList<>(cloner);
    }

    public void Display(){
        for (int j = 0; j < userList.size(); j++) {
            System.out.println(userList.get(j));
        } ;
    }

    public ArrayList<Person> getUserList() {
        return userList;
    }


}
