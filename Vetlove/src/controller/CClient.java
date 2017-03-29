package controller;

import java.util.ArrayList;
import model.MAnimal;
import model.MClient;
import model.MQuery;
import model.MRecord;
import model.MVaccine;

public class CClient {
    
    ArrayList<MClient> client = new ArrayList<MClient>();
    
    public void insertClient(String name, String address, String email, String phone) {
        client.add(new MClient(client.size(),name, address, email, phone));
    }
    
    public MClient searchClient(int id) {
        for(MClient client_ : client) {
            if(client_.getId() == id) return client_;
        }
        return null;
    }
    
    public ArrayList<MClient> listClient() {
        return client;
    }
    
    public void deleteClient(MClient client_) {
        client.remove(client_);
    }
    
    public void insertAnimal(MClient client_, String name, String classification, String race, String birthday) {
        client.get(client.indexOf(client_)).setAnimal(new MAnimal(name, classification, race, birthday, new MRecord()));
    }
    
    public MAnimal searchAnimal(MClient client_, String name) {
        for(MAnimal animal : client.get(client.indexOf(client_)).getAnimal()) {
            if(animal.getName().equals(name)) return animal;
        }
        return null;
    }
    
    public ArrayList<MAnimal> listAnimal(MClient client_) {
        return client.get(client.indexOf(client_)).getAnimal();
    }
    
    public void insertRecord(MClient client_, MAnimal animal,MVaccine vaccine, MQuery query) {
        client.get(client.indexOf(client_)).getAnimal().get(client.get(client.indexOf(client_)).getAnimal().indexOf(animal)).setRecord(new MRecord(vaccine, query));
    }
    
    public MRecord listRecord(MClient client_, MAnimal animal) {
        return client.get(client.indexOf(client_)).getAnimal().get(client.get(client.indexOf(client_)).getAnimal().indexOf(animal)).getRecord();
    }
    
    
}
