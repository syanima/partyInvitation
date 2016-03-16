package entities;

public class Age {
    private final int age;

    public Age(int age) {
        this.age = age;
    }

    public String toString(){
        return age+"";
    }

    public boolean checkingAgeIsGreatorOrNot(int givenAge){
     return age >= givenAge;
    }
}
