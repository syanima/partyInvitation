package nameFormats;

public class FormalName implements FormatRepresentation {

    @Override
    public String formatName(String firstName, String surName) {
        return String.format("%s, %s", surName, firstName);
    }
}
