package Entities;

public class Vehicle {
    private int vehicle_id, client_id, year;
    private String vehicle_brand, vehicle_model;

    public Vehicle(int vehicle_id){
        this.vehicle_id = vehicle_id;
    }
    
    public Vehicle(int vehicle_id, int client_id, int year, String vehicle_brand, String vehicle_model) {
        this.vehicle_id = vehicle_id;
        this.client_id = client_id;
        this.year = year;
        this.vehicle_brand = vehicle_brand;
        this.vehicle_model = vehicle_model;
    }

    public int getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(int vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getVehicle_brand() {
        return vehicle_brand;
    }

    public void setVehicle_brand(String vehicle_brand) {
        this.vehicle_brand = vehicle_brand;
    }

    public String getVehicle_model() {
        return vehicle_model;
    }

    public void setVehicle_model(String vehicle_model) {
        this.vehicle_model = vehicle_model;
    }
}
