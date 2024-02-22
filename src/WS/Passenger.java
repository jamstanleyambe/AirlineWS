package WS;

import java.util.ArrayList;
import java.util.List;

public class Passenger {

    int id, age;

    public Passenger(int id, int age, String name, String nationality) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.nationality = nationality;
    }
    List<Passenger> init(){
        List<Passenger> l = new ArrayList<>();
        l.add(new Passenger(1, 01, "jam", "cameroonian"));
        l.add(new Passenger(2, 02, "stanley", "nigerian"));
        l.add(new Passenger(3, 03, "ambe", "moroccan"));
        return l;

    }
    

    String name;

    String nationality;


    public Passenger() {
    }
    
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }


    
    
    
}
