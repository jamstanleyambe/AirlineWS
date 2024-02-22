package WS;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public class AirlineWS {
    AirlineBL aBL = new AirlineBL();
    @WebMethod
     public Aircraft   addAircraft(Aircraft a){
     aBL.addAircraft(a);
     return  a;
     }
     @WebMethod
     public List<Aircraft> getAllAircraft(){
        return aBL.retriveAircrafts();
     }

}





//package ws;
//
//import javax.jws.WebMethod;
//import javax.jws.WebParam;
//import javax.jws.WebService;
//import java.util.ArrayList;
//import java.util.List;
//
//
//@WebService
//public class BankService {
//    @WebMethod(operationName = "conversionEuroGh")
//
//    public double conversion(@WebParam(name = "amount") double mt) {
//        return 10 * mt; }
//    @WebMethod public String test() {
//        return "test"; }
//
//    public List<Account> getAcounptes() {
//        List<Account> accounts = new ArrayList<>();
//        for (int i = 0; i < 6; i++) accounts.add(new Account(i, (float) Math.random() * 152)); return accounts;
////    } }