package printingUtilities;


import entities.Address;
import entities.Age;
import entities.Name;
import entities.Person;
import org.junit.Assert;
import org.junit.Test;

public class StyleTest {
    @Test
    public void for_checking_if_the_printing_style_works_with_option_i() throws Exception {
        Style style = new Style();
        Name name = new Name("Athul", "Prakash");
        Address address = new Address("Thrissur","Kerala","India");
        Age age = new Age(21);
        String gender = "Male";
        Person guest = new Person(name,address,gender,age);
        String styleInfo = style.accessName(guest,"-i");
        Assert.assertEquals("Mr Athul Prakash",styleInfo);
    }

    @Test
    public void for_checking_if_the_printing_style_works_with_option_f() throws Exception {
        Style style = new Style();
        Name name = new Name("Athul", "Prakash");
        Address address = new Address("Thrissur","Kerala","India");
        Age age = new Age(21);
        String gender = "Male";
        Person guest = new Person(name,address,gender,age);
        String styleInfo = style.accessName(guest,"-f");
        Assert.assertEquals("Mr Prakash, Athul",styleInfo);
    }

}
