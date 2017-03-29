package model;

import java.util.ArrayList;

public class MClient {
   
    private int id;
    private String name;
    private String address;
    private String email;
    private String phone;
    private ArrayList<MAnimal> animal = new ArrayList<MAnimal>();

    public MClient(int id, String name, String address, String email, String phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

    public ArrayList<MAnimal> getAnimal() {
        return animal;
    }

    public void setAnimal(MAnimal animal) {
        this.animal.add(animal);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
