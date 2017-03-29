package model;

public class MAnimal {
    
    private String name;
    private String classification;
    private String race;
    private String birthday;
    private MRecord record;

    public MAnimal(String name, String classification, String race, String birthday, MRecord record) {
        this.name = name;
        this.classification = classification;
        this.race = race;
        this.birthday = birthday;
        this.record = record;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public MRecord getRecord() {
        return record;
    }

    public void setRecord(MRecord record) {
        this.record = record;
    }

}
