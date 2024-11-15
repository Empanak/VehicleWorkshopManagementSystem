package Entities;

import java.math.BigDecimal;
import java.sql.Date;

public class Repair {

    private int rep_id, customer_id, vehicle_id, repair_type_id;
    private Date rep_start_date, rep_end_date;
    private BigDecimal repair_percentage_cost, repair_total_cost;
    private String rep_additional_notes;

    //Constructor only ID
    public Repair(int rep_id){
        this.rep_id = rep_id;
    }
    
    //Constructor endDate and ID
    public Repair(int rep_id, Date rep_end_date) {    
        this.rep_id = rep_id;
        this.rep_end_date = rep_end_date;
    }
    //Constructor all except dates and add notes
    public Repair(int rep_id, int customer_id, int vehicle_id, int repair_type_id, BigDecimal repair_percentage_cost, BigDecimal repair_total_cost, String rep_notas_adicionales) {
        this.rep_id = rep_id;
        this.customer_id = customer_id;
        this.vehicle_id = vehicle_id;
        this.repair_type_id = repair_type_id;        this.repair_percentage_cost = repair_percentage_cost;
        this.repair_total_cost = repair_total_cost;
        this.rep_additional_notes = rep_notas_adicionales;
    }
    /*//CONSTRUCTOR WITHOUT ADDITIONAL NOTES
    public Repair(int rep_id, int customer_id, int vehicle_id, int repair_type_id, Date rep_start_date, Date rep_end_date, BigDecimal repair_percentage_cost, BigDecimal repair_total_cost) {
        this.rep_id = rep_id;
        this.customer_id = customer_id;
        this.vehicle_id = vehicle_id;
        this.repair_type_id = repair_type_id;
        this.rep_start_date = rep_start_date;
        this.rep_end_date = rep_end_date;
        this.repair_percentage_cost = repair_percentage_cost;
        this.repair_total_cost = repair_total_cost;
        this.rep_notas_adicionales = null;
    }
    //CONSTRUCTOR WITHOUT END DATE
    public Repair(int rep_id, int customer_id, int vehicle_id, int repair_type_id, Date rep_start_date, BigDecimal repair_percentage_cost, BigDecimal repair_total_cost, String rep_notas_adicionales) {
        this.rep_id = rep_id;
        this.customer_id = customer_id;
        this.vehicle_id = vehicle_id;
        this.repair_type_id = repair_type_id;
        this.rep_start_date = rep_start_date;
        this.rep_end_date = null;
        this.repair_percentage_cost = repair_percentage_cost;
        this.repair_total_cost = repair_total_cost;
        this.rep_notas_adicionales = rep_notas_adicionales;
    }
    //CONSTRUCTOR WITHOUT ADDITIONAL NOTES AND END DATE
    public Repair(int rep_id, int customer_id, int vehicle_id, int repair_type_id, Date rep_start_date, BigDecimal repair_percentage_cost, BigDecimal repair_total_cost) {
        this.rep_id = rep_id;
        this.customer_id = customer_id;
        this.vehicle_id = vehicle_id;
        this.repair_type_id = repair_type_id;
        this.rep_start_date = rep_start_date;
        this.rep_end_date = null;
        this.repair_percentage_cost = repair_percentage_cost;
        this.repair_total_cost = repair_total_cost;
        this.rep_notas_adicionales = null;
    }
*/
    public int getRep_id() {
        return rep_id;
    }

    public void setRep_id(int rep_id) {
        this.rep_id = rep_id;
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

    public int getRepair_type_id() {
        return repair_type_id;
    }

    public void setRepair_type_id(int repair_type_id) {
        this.repair_type_id = repair_type_id;
    }

    public Date getRep_start_date() {
        return rep_start_date;
    }

    public void setRep_start_date(Date rep_start_date) {
        this.rep_start_date = rep_start_date;
    }

    public Date getRep_end_date() {
        return rep_end_date;
    }

    public void setRep_end_date(Date rep_end_date) {
        this.rep_end_date = rep_end_date;
    }

    public BigDecimal getRepair_percentage_cost() {
        return repair_percentage_cost;
    }

    public void setRepair_percentage_cost(BigDecimal repair_percentage_cost) {
        this.repair_percentage_cost = repair_percentage_cost;
    }

    public BigDecimal getRepair_total_cost() {
        return repair_total_cost;
    }

    public void setRepair_total_cost(BigDecimal repair_total_cost) {
        this.repair_total_cost = repair_total_cost;
    }

    public String getRep_additional_notes() {
        return rep_additional_notes;
    }

    public void setRep_additional_notes(String rep_additional_notes) {
        this.rep_additional_notes = rep_additional_notes;
    }
}