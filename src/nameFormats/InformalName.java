package nameFormats;

public class InformalName implements FormatRepresentation {
    @Override
    public String formatName(String firstName, String surName){
        return String.format("%s %s",firstName, surName);
    }
}
