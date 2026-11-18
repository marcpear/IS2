package software.ulpgc;

import java.time.LocalDate;

public class Main {

    static void main(){
        Person person = new Person("Marcos", LocalDate.of(2005, 12, 12));
        System.out.println(person.age());
    }

}
