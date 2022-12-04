import java.util.List;

public class Community {
    private int numberOfPeople;
    private String name;

    public Community(int numberOfPeople, String name){
        this.numberOfPeople = numberOfPeople;
        this.name = name;
        this.communitcate(name);

    }

    public static void main(String[] args){
        System.out.println("hello community!");
        Community community = new Community(10, "Better World");

    }

    void communitcate(String name){
        System.out.println("Hi, our community name is "+ name);
    }
}
