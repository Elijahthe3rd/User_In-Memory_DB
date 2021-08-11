import Model.Person;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class GatherUserInfo {

    private  String name;
    private  UUID id;
    private  String surname;
    private  String email;
    private  int yearBorn;
    private  int birthMonth;
    private  int birthDay;
    private  Scanner sc = new Scanner(System.in);


    public List<Person> getUserData() {
        System.out.println("How many users do you wish  to add?\n");
        Scanner scanner = new Scanner(System.in);
        int userCount = scanner.nextInt();
        Person p=new Person();

        LocalDate dob = LocalDate.now();
        int counter=1;

        List<Person> lst=new ArrayList<>();
        int len = lst.size();
        doLooppe:do {

            if(userCount>0 && userCount<=1)
            System.out.println("Provide User "+(counter-userCount)+"\n");
            else{
                System.out.println("Provide User "+(userCount)+"\n");
            }

            id = UUID.randomUUID();
            System.out.println("Default Unique User ID(UUID) Auto-Genereted: "+id);
            System.out.println("Please enter your FirstName:\n");
            name = sc.next();
            System.out.println("Please enter your LastName:\n");
            surname = sc.next();

            System.out.println("Please enter your Email:\n");
            email = sc.next();

            System.out.println("Please enter the Year you were born on:\n");

            yearBorn = sc.nextInt();

            System.out.println("Please enter the Month you were born on:\n");

            birthMonth = sc.nextInt();
            System.out.println("Please enter the Day you were born on:\n");
            birthDay = sc.nextInt();

            if(userCount==0){
                System.out.println("Data capture successfully, Thank you.");
                break doLooppe;
            }

            userCount--;

            dob = LocalDate.of(yearBorn, birthMonth, birthDay);

            p=new Person( name, surname, email, dob);
            //add person object to the list/db
            lst.add(p);

            System.out.println("\nAge = "+ Math.abs(Period.between(LocalDate.now(),dob).getYears())+"yrs old\n");
            StringBuilder msg=new StringBuilder("Hello "+p.getName()+" "+p.getSurname()+" your details have been saved to our database:\n\nBelow is Info you provided\n"+lst);

            int lengthAfter = lst.size();
            if(lengthAfter>len){
                System.out.println(msg);
            }else{
                System.out.println(new StringBuilder("Something went wrong: was not saved to our database"));
            }

        }while (userCount > 0);


        return lst;
    }
}
