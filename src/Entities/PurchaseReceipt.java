package Entities;

import java.math.BigDecimal;
import java.sql.Date;

public class PurchaseReceipt {
    private int ticket_id, customer_id, vehicle_id, repair_id, type_of_repair_id;
    private BigDecimal total;
    private Date emission_date;
    private String observations;

    public PurchaseReceipt(int ticket_id) {
        this.ticket_id = ticket_id;
    }

    public PurchaseReceipt(int ticket_id, int customer_id, int vehicle_id, int repair_id, int type_of_repair_id, BigDecimal total, String observations) {
        this.ticket_id = ticket_id;
        this.customer_id = customer_id;
        this.vehicle_id = vehicle_id;
        this.repair_id = repair_id;
        this.type_of_repair_id = type_of_repair_id;
        this.total = total;
        this.observations = observations;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    
    public int getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(int ticket_id) {
        this.ticket_id = ticket_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(int vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    public int getRepair_id() {
        return repair_id;
    }

    public void setRepair_id(int repair_id) {
        this.repair_id = repair_id;
    }

    public int getType_of_repair_id() {
        return type_of_repair_id;
    }

    public void setType_of_repair_id(int type_of_repair_id) {
        this.type_of_repair_id = type_of_repair_id;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Date getEmission_date() {
        return emission_date;
    }

    public void setEmission_date(Date emission_date) {
        this.emission_date = emission_date;
    }
}
