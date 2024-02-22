package WS;

import java.util.*;

public class AirlineDAL {
    Map<Integer, List<Object>> datasource = new HashMap<>();
    public AirlineDAL(Map<Integer, List<Object>> datasource) {
        this.datasource = datasource;
        this.datasource.put(1,new ArrayList<>(new Aircraft().init()));
        this.datasource.put(2,new ArrayList<>(new Booking().init()));
        this.datasource.put(3,new ArrayList<>(new Passenger().init()));
    }
    public AirlineDAL() {
        this.datasource.put(1,new ArrayList<>(new Aircraft().init()));
        this.datasource.put(2,new ArrayList<>(new Booking().init()));
        this.datasource.put(3,new ArrayList<>(new Passenger().init()));
    }
    public Aircraft addAircraft(Aircraft a){
        this.datasource.get(1).add(a);
        return a;

    }
    public List<Aircraft> retriveAircrafts(){
        List<Aircraft> l = new ArrayList<>();
        this.datasource.get(1).forEach(e->{
            l.add((Aircraft) e);
        });

        return l;
    }



}
