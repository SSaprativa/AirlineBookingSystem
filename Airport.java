package model;

import java.util.ArrayList;

public class Airport {
    public String name;
    public Address address;
    public int uniqueId;
    public ArrayList<Aircraft> flights = new ArrayList<Aircraft>();

    public Airport(String name,Address address,int id){
        this.name = name;
        this.address = address;
        this.uniqueId = id;
    }

    public void addAircraft(Aircraft aircraft){
        flights.add(aircraft);
    }

    public ArrayList<Aircraft> getAircraft(){
        return flights;
    }
    
}
