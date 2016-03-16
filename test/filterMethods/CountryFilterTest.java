package filterMethods;

import entities.Address;
import entities.Age;
import entities.Name;
import entities.Person;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CountryFilterTest {
    @Test
    public void test_person_class_to_find_wheather_the_person_is_above_a_particular_country() throws Exception {
        Name name = new Name("Jaanu","Sivadasan");
        Address address = new Address("Banglore","Karnataka","India");
        Age age = new Age(21);
        Person person = new Person(name,address,"Female",age);
        CountryFilter validCountry = new CountryFilter("Uganda");
        assertFalse(validCountry.isAValidGuest(person));
    }

    @Test
    public void test_person_class_to_find_wheather_the_person_is_of_a_particular_country() throws Exception {
        Name name = new Name("Jaanu","Sivadasan");
        Age age = new Age(21);
        Address address = new Address("Banglore","Karnataka","India");
        Person person = new Person(name,address,"Female",age);
        CountryFilter validCountry = new CountryFilter("India");
        assertTrue(validCountry.isAValidGuest(person));
    }
}
