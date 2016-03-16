package entities;

import nameFormats.FormatRepresentation;

public class Name {
    private String firstName;
    private String surName;

    public Name(String firstName, String surName) {
        this.firstName = firstName;
        this.surName = surName;
    }

    public String formatUsing(FormatRepresentation rep){
        return rep.formatName(firstName,surName);
    }
}