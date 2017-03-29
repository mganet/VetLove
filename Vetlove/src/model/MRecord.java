package model;

import java.util.ArrayList;

public class MRecord {
   
    private ArrayList<MVaccine> vaccine = new ArrayList<MVaccine>();
    private ArrayList<MQuery>   query = new ArrayList<MQuery>();
    
    public MRecord() {
        
    }
    
    public MRecord(MVaccine vaccine, MQuery query) {
        this.vaccine.add(vaccine);
        this.query.add(query);
    }

    public ArrayList<MVaccine> getVaccine() {
        return vaccine;
    }

    public void setVaccine(ArrayList<MVaccine> vaccine) {
        this.vaccine = vaccine;
    }

    public ArrayList<MQuery> getQuery() {
        return query;
    }

    public void setQuery(ArrayList<MQuery> query) {
        this.query = query;
    }
  
}
