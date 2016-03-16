package entities;

import nameFormats.FormalName;
import nameFormats.FormatRepresentation;
import nameFormats.InformalName;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NameTest {
    @Test
    public void test_the_Name_class_with_sir_name_followed_by_first_name() throws Exception {
        Name name = new Name("Sonia","Menon");
        String expected = "Sonia Menon";
        FormatRepresentation displayFormat = new InformalName();
        assertEquals(expected,name.formatUsing(displayFormat));
    }

    @Test
    public void test_the_Name_class_with_first_name_followed_by_sir_name() throws Exception {
        Name name = new Name("Sonia","Menon");
        String expected = "Menon, Sonia";
        FormatRepresentation displayFormat = new FormalName();
        assertEquals(expected,name.formatUsing(displayFormat));
    }
}
