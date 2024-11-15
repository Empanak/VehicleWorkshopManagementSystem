package Entities;

public class TypeOfRepair {
    private int type_id;
    private String type_name, type_description;
    private float type_cost;

    public TypeOfRepair(int type_id, String type_name, String type_description, float type_cost) {
        this.type_id = type_id;
        this.type_name = type_name;
        this.type_description = type_description;
        this.type_cost = type_cost;
    }

    public int getType_id() {
        return type_id;
    }

    public void setType_id(int type_id) {
        this.type_id = type_id;
    }

    public String getType_name() {
        return type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name;
    }

    public String getType_description() {
        return type_description;
    }

    public void setType_description(String type_description) {
        this.type_description = type_description;
    }

    public float getType_cost() {
        return type_cost;
    }

    public void setType_cost(float type_cost) {
        this.type_cost = type_cost;
    }
    
    
}
