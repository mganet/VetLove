package model;

public class MVaccine {
    
    private String name;
    private String Date;
    private float  price;

    public MVaccine(String name, String Date, float price) {
        this.name = name;
        this.Date = Date;
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }
 
}
