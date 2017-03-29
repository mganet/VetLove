package model;

public class MQuery {
    
    private String name;
    private String date;
    
    public MQuery() {
        
    }
    
    public MQuery(String name, String date) {
        this.name = name;
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
 
}
