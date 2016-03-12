package guestGenerator;

import entities.Address;
import entities.Name;
import entities.Person;

import java.util.ArrayList;

public class GuestListParser {
    private final String fileData;

    public GuestListParser(String fileData) {
        this.fileData = fileData;
    }

    public ArrayList<Person> parse() {
        ArrayList<Person> guests = new ArrayList<>();

        String[] newLineSeparatedString = fileData.split("\n");

        for (String personString : newLineSeparatedString) {
            String[] personDetails = personString.split(",");
            Name name = new Name(personDetails[0],personDetails[1]);
            Address address = new Address(personDetails[6]);
            int age = Integer.parseInt(personDetails[3]);
            String gender = personDetails[2];
            Person guest = new Person(name,address,gender,age);
            guests.add(guest);
        }

        return guests;
    }

}