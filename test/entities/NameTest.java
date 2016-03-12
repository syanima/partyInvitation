package entities;

import nameFormats.FormalName;
import nameFormats.FormatRepresentation;
import nameFormats.InformalName;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NameTest {
    @Test
    public void test_the_Name_class_with_sir_name_followed_by_first_name() throws Exception {
        Name jayanth = new Name("Srijayanth","Sreedhar");
        String expected = "Srijayanth Sreedhar";
        FormatRepresentation displayFormat = new InformalName();
        assertEquals(expected,jayanth.formatUsing(displayFormat));
    }

    @Test
    public void test_the_Name_class_with_first_name_followed_by_sir_name() throws Exception {
        Name swamiji = new Name("Vivek","Haridas");
        String expected = "Haridas, Vivek";
        FormatRepresentation displayFormat = new FormalName();
        assertEquals(expected,swamiji.formatUsing(displayFormat));
    }
}
