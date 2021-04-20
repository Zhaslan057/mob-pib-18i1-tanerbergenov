package ru.example.payroll.repository;

import org.springframework.stereotype.Repository;
import ru.example.payroll.domain.Person;

import java.util.List;

@Repository
public class PersonRepository {

    private final List<Person> persons = List.of(
            new Person(1, "Иван Иванович Иванов", 100000),
            new Person(2, "Петр Петрович Петров", 200000),
            new Person(3, "Илья Ильич Ильин", 150000),
            new Person(4, "Сергей Сергеевич Сергеев", 123456)
    );

    public List<Person> findAllPersons() {
        return persons;
    }

    public Person findPersonById(int id) {
        Person foundPerson = null;
        for (Person p : persons) {
            if (p.getId() == id) {
                foundPerson = p;
            }
        }
        return foundPerson;
    }
}
