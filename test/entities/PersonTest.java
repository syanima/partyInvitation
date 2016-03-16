package entities;

import nameFormats.FormalName;
import nameFormats.FormatRepresentation;
import nameFormats.InformalName;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PersonTest {
    @Test
    public void test_person_class_to_find_wheather_it_represents_the_Prefix_of_Male_with_informal_format() throws Exception {
        Name name = new Name("Ram", "Krishnan");
        Address address = new Address("Banglore","Karnataka","India");
        Age age = new Age(35);
        Person person = new Person(name,address,"Male",age);
        FormatRepresentation displayFormat = new InformalName();
        String expected = "Mr Ram Krishnan";
        assertEquals(expected,person.formatUsing(displayFormat));

    }

    @Test
    public void test_person_class_to_find_wheather_it_represents_the_Prefix_of_Male_with_formal_format() throws Exception {
        Name name = new Name("Vinay", "Lal");
        Address address = new Address("Banglore","Karnataka","India");
        Age age = new Age(40);
        Person person = new Person(name, address,"Male",age);
        FormatRepresentation displayFormat = new FormalName();
        String expected = "Mr Lal, Vinay";
        assertEquals(expected, person.formatUsing(displayFormat));
    }

    @Test
    public void test_person_class_to_find_wheather_it_represents_the_Prefix_of_Female_with_informal_format() throws Exception {
        Name name = new Name("Sheena", "Ajeendran");
        Address address = new Address("Banglore","Karnataka","India");
        Age age = new Age(42);
        Person person = new Person(name, address,"Female",age);
        FormatRepresentation displayFormat = new InformalName();
        String expected = "Ms Sheena Ajeendran";
        assertEquals(expected,person.formatUsing(displayFormat));

    }
    @Test
    public void test_person_class_to_find_wheather_it_represents_the_Prefix_of_Female_with_formal_format() throws Exception {
        Name name = new Name("Veena", "Kavidaran");
        Address address = new Address("Banglore","Karnataka","India");
        Age age = new Age(23);
        Person person = new Person(name, address,"Female",age);
        FormatRepresentation displayFormat = new FormalName();
        String expected = "Ms Kavidaran, Veena";
        assertEquals(expected,person.formatUsing(displayFormat));

    }

    @Test
    public void test_person_class_to_find_wheather_the_person_is_above_a_particular_age() throws Exception {
        Name name = new Name("Jaanu","Sivadasan");
        Address address = new Address("Banglore","Karnataka","India");
        Age age = new Age(21);
        Person person = new Person(name,address,"Female",age);
        assertTrue(person.isOlderThan(20));
    }

    @Test
    public void test_person_class_to_find_wheather_the_person_is_of_a_particular_age() throws Exception {
        Name name = new Name("Jaanu","Sivadasan");
        Address address = new Address("Banglore","Karnataka","India");
        Age age = new Age(21);
        Person person = new Person(name,address,"Female",age);
        assertTrue(person.isOlderThan(21));
    }

    @Test
    public void test_person_class_to_find_wheather_the_person_is_below_a_particular_age() throws Exception {
        Name name = new Name("Jaanu","Sivadasan");
        Address address = new Address("Banglore","Karnataka","India");
        Age age = new Age(21);
        Person person = new Person(name,address,"Female",age);
        assertFalse(person.isOlderThan(25));
    }

}
