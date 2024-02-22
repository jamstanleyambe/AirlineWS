package WS;

import java.util.List;

public class AirlineBL {
    AirlineDAL aDl = new AirlineDAL();


    public AirlineBL(AirlineDAL aDl) {
        this.aDl = aDl;
    }

    public AirlineBL() {
    }

    public Aircraft addAircraft(Aircraft a){
        this.aDl.addAircraft(a);
        return a;
    }
    public List<Aircraft> retriveAircrafts(){
       return
        this.aDl.retriveAircrafts();

    }
}
