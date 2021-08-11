import Model.Person;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.logging.Logger;

public class UserList {

    public void DisplayList(ArrayList<Person> person) {
        for (int i = 0; i < person.size(); i++) {
            try{
                if(person.size()>0) {
                    Person person1 = person.get(i);
                    System.out.println(person1);
                }else{
                    throw  new EmptyStackException();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

}
