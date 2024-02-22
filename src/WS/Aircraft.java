package WS;

import java.util.ArrayList;
import java.util.List;

public class Aircraft {

    int id;
    String model;
    int capacity;
    int range;

    public Aircraft() {
    }

    public Aircraft(int id, String model, int capacity, int range) {
        this.id = id;
        this.model = model;
        this.capacity = capacity;
        this.range = range;
    }

    List<Aircraft> init(){
        List<Aircraft> l = new ArrayList<>();
        l.add(new Aircraft(1, "aircraftm1", 80, 5));
        l.add(new Aircraft(2, "aircraftm2", 90, 10));
        l.add(new Aircraft(3, "aircraftm3", 100, 15));
        return l;

    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }
}
