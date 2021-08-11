//import java.util.ArrayList;
//import java.util.List;
//import java.util.UUID;
//
//public class UpdateUser {
//
//    GatherUserInfo getInfo=new GatherUserInfo();
//    UserList userList=new UserList();
//
//    public List update(UUID id){
//
////        getInfo.getUserData();
//                    return new ArrayList();
//    }
//}



//import Model.Person;
//
//import java.time.LocalDate;
//import java.util.Scanner;
//import java.util.UUID;
//
//public class GatherUserInfo {
//
//    private static String name;
//    private static UUID id;
//    private static String surname;
//    private static String email;
//    private static int yearBorn;
//    private static int birthMonth;
//    private static int birthDay;
//    private final Scanner sc = new Scanner(System.in);
//
//    public Person getUserData() {
//        System.out.println("How many users do you wish  to add?\n");
//        Scanner scanner = new Scanner(System.in);
//        int userCount = scanner.nextInt();
//        String exit = "To Exit: Enter \'x\' to Stop\n";
////        System.out.println(exit);
//
//        LocalDate dob;
//        int counter=1;
//        Person p;
//        doLooppe:do {
//
//            p=new Person();
//            if(userCount>counter)
//                System.out.println("Provide User "+(counter)+"\n");
//            else{
//                System.out.println("Provide User "+(counter)+"\n");
//            }
//
//            p.setId();
//            System.out.println("Default Unique User ID(UUID) Auto-Genereted: "+id);
//            System.out.println("Please enter your FirstName:\n");
//            name = sc.next();
//            p.setName(name);
//            System.out.println("Please enter your LastName:\n");
//            surname = sc.next();
//            p.setSurname(surname);
//            System.out.println("Please enter your Email:\n");
//            email = sc.next();
//            p.setEmail(email);
//
//            System.out.println("Please enter the Year you were born on:\n");
//            yearBorn = sc.nextInt();
//            System.out.println("Please enter the Month you were born on:\n");
//
//            birthMonth = sc.nextInt();
//            System.out.println("Please enter the Day you were born on:\n");
//            birthDay = sc.nextInt();
//            dob = LocalDate.of(yearBorn, birthMonth, birthDay);
//            p.setDate_of_birth (dob);
//            p.setDate_of_birth(p.getDate_of_birth());
//            if(userCount==0){
//                break doLooppe;
//            }
//
//            counter++;
//            userCount--;
//
//        }while (userCount > 0);
//
//        return p;
//    }
//
//    public  String getName () {
//        return name;
//    }
//
//    public static String getSurname () {
//        return surname;
//    }
//
//    public static String getEmail () {
//        return email;
//    }
//
//    public static int getYearBorn () {
//        return yearBorn;
//    }
//
//    public static int getBirthMonth () {
//        return birthMonth;
//    }
//
//    public static int getBirthDay () {
//        return birthDay;
//    }
//}

//
//package Model;
//
//import java.text.DateFormat;
//import java.time.LocalDate;
//import java.time.Period;
//import java.time.format.DateTimeFormatter;
//import java.util.Arrays;
//import java.util.Locale;
//import java.util.UUID;
//
//public class Person {
//
//    private  UUID id;
//    private  String name;
//    private  String surname;
//    private  String email;
//    private  LocalDate date_of_birth;
//    private  int age;
//    private  LocalDate currentDate;
//
//    public Person(){}
//
//    //consumers
//    public void setId() {
//        this.id = UUID.randomUUID();
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public void setDate_of_birth(LocalDate date_of_birth) {
//        this.date_of_birth = date_of_birth;
//    }
//
//    public void setAge(LocalDate dob) {
//        this.age = Period.between(dob,LocalDate.now()).getYears();
//    }
//
//
//    public void setCurrentDate(LocalDate currentDate) {
//        this.currentDate = currentDate;
//    }
//
//    //accumulators
//    public UUID getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public LocalDate getDate_of_birth() {
//        return date_of_birth;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    @Override
//    public String toString() {
//        return "Person {" +
//                "\nID\t\t=\t" + id +
//                ", \nNAME\t=\t'" + name + '\'' +
//                ", \nSURNAME\t=\t'" + surname + '\'' +
//                ", \nEMAIL\t=\t'" + email + '\'' +
//                ", \nDOB\t\t=\t" + date_of_birth +
//                ", \nAGE\t\t=\t" + age +
//                ", \nDATE\t=\t" + currentDate +
//                "\n"+'}';
//    }
//}
