package Model;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

public class Person {

    private  UUID id;
    private  String name;
    private  String surname;
    private  String email;
    private  LocalDate date_of_birth;
    private  int age;
    private  LocalDate currentDate;

    public Person(){}

    public Person(String name, String surname, String email, LocalDate dob) {
        this.id=UUID.randomUUID();
        this.name=name;
        this.surname=surname;
        this.email=email;
        this.date_of_birth=dob;
        this.currentDate=LocalDate.now();
    }

    //consumers

    //accumulators
    public UUID getId()
    { return id;
    }
    public String getName()
    { return name;
    }
    public String getSurname()
    { return surname;
    }
    public String getEmail()
    { return email;
    }
    public LocalDate getDate_of_birth()
    { return date_of_birth;
    }
    public LocalDate getCurrentDate()
    {
        return currentDate;}

    public int getAge()
    { return age;
    }

    //Make Class object/instance printing more readable
    @Override
    public String toString()
    { return "Person {" +
                "\nID\t\t\t=\t" + id +
                ", \nNAME\t\t=\t'" + name + '\'' +
                ", \nSURNAME\t\t=\t'" + surname + '\'' +
                ", \nEMAIL\t\t=\t'" + email + '\'' +
                ", \nDOB\t\t\t=\t" + date_of_birth +
                ", \nAGE\t\t\t=\t" + age +
                ", \ncreate on\t=\t"  +
            LocalDateTime.of(currentDate, LocalTime.now()).format(DateTimeFormatter.ISO_LOCAL_DATE_TIME.withLocale(Locale.getDefault()))+ "\n"+'}';
    }
}
