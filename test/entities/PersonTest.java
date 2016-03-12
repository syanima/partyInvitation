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
        Name name = new Name("Srijayanth", "Sreedhar");
        Address address = new Address("India");
        Person jayanth = new Person(name,address,"Male", 35);
        FormatRepresentation displayFormat = new InformalName();
        String expected = "Mr Srijayanth Sreedhar";
        assertEquals(expected,jayanth.formatUsing(displayFormat));

    }

    @Test
    public void test_person_class_to_find_wheather_it_represents_the_Prefix_of_Male_with_formal_format() throws Exception {
        Name name = new Name("Vivek", "Haridas");
        Address address = new Address("India");
        Person swamiji = new Person(name, address,"Male",40);
        FormatRepresentation displayFormat = new FormalName();
        String expected = "Mr Haridas, Vivek";
        assertEquals(expected, swamiji.formatUsing(displayFormat));
    }

    @Test
    public void test_person_class_to_find_wheather_it_represents_the_Prefix_of_Female_with_informal_format() throws Exception {
        Name name = new Name("Sheena", "Ajeendran");
        Address address = new Address("India");
        Person amma = new Person(name, address,"Female",42);
        FormatRepresentation displayFormat = new InformalName();
        String expected = "Ms Sheena Ajeendran";
        assertEquals(expected,amma.formatUsing(displayFormat));

    }
    @Test
    public void test_person_class_to_find_wheather_it_represents_the_Prefix_of_Female_with_formal_format() throws Exception {
        Name name = new Name("Veena", "Kavidaran");
        Address address = new Address("India");
        Person cousin = new Person(name, address,"Female",22);
        FormatRepresentation displayFormat = new FormalName();
        String expected = "Ms Kavidaran, Veena";
        assertEquals(expected,cousin.formatUsing(displayFormat));

    }

    @Test
    public void test_person_class_to_find_wheather_the_person_is_above_a_particular_age() throws Exception {
        Name name = new Name("Jaanu","Sivadasan");
        Address address = new Address("Uganda");
        Person lover = new Person(name,address,"Female",21);
        assertTrue(lover.isOfOrAboveAge(20));
    }

    @Test
    public void test_person_class_to_find_wheather_the_person_is_of_a_particular_age() throws Exception {
        Name name = new Name("Jaanu","Sivadasan");
        Address address = new Address("Uganda");
        Person lover = new Person(name,address,"Female",21);
        assertTrue(lover.isOfOrAboveAge(21));
    }

    @Test
    public void test_person_class_to_find_wheather_the_person_is_below_a_particular_age() throws Exception {
        Name name = new Name("Jaanu","Sivadasan");
        Address address = new Address("Uganda");
        Person lover = new Person(name,address,"Female",21);
        assertFalse(lover.isOfOrAboveAge(25));
    }

}
