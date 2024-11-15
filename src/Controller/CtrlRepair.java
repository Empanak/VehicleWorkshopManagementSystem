package Controller;

import Connection.Connect;
import Entities.Repair;
import Entities.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CtrlRepair {

    public boolean add(Repair repairObj, User userObj){
        Connection cn = Connect.connect(userObj);
        String query = "INSERT INTO reparacion (rep_id, cliente_id, vehiculo_id, tipo_reparacion_id, reparacion_porcentaje_costo, reparacion_coste_total, rep_notas_adicionales) VALUES (?, ?, ?, ?, ?, ?, ?);";
        int operations;
        try(PreparedStatement st = cn.prepareStatement(query)){
            st.setInt(1, 0);
            st.setInt(2, repairObj.getCustomer_id());
            st.setInt(3, repairObj.getVehicle_id());
            st.setInt(4, repairObj.getRepair_type_id());
            st.setBigDecimal(5, repairObj.getRepair_percentage_cost());
            st.setBigDecimal(6, repairObj.getRepair_total_cost());
            st.setString(7, repairObj.getRep_additional_notes());
            operations = st.executeUpdate();
            st.close();
            cn.close();
            System.out.println(operations + "operations executed");
            return true;
        }catch (SQLException e){
            System.out.println("Insert into repair table failed " + e);
        }
        return false;
    }
    
    public boolean endRepair(Repair repairObj, User userObj){
        Connection cn = Connect.connect(userObj);
        String query = "UPDATE reparacion SET reparacion_fecha_salida=? WHERE rep_id=?";
        int operations;
        try(PreparedStatement st = cn.prepareStatement(query)){
            st.setDate(1, repairObj.getRep_end_date());
            st.setInt(2, repairObj.getRep_id());
            operations = st.executeUpdate();
            st.close();
            cn.close();
            System.out.println(operations + " operations executed");
            return true;
        }catch(SQLException e){
            System.out.println("Update in repair table ID: " + repairObj.getRep_id() + " failed " + e);
        }
        return false;
    }

    public boolean update(Repair repairObj, User userObj){
        Connection cn = Connect.connect(userObj);
        String query = "UPDATE reparacion SET cliente_id=?, vehiculo_id=?, tipo_reparacion_id=?, reparacion_porcentaje_costo=?, reparacion_coste_total=?, rep_notas_adicionales=? WHERE rep_id=?";
        int operations;
        try(PreparedStatement st = cn.prepareStatement(query)){
            st.setInt(1, repairObj.getCustomer_id());
            st.setInt(2, repairObj.getVehicle_id());
            st.setInt(3, repairObj.getRepair_type_id());
            st.setBigDecimal(4, repairObj.getRepair_percentage_cost());
            st.setBigDecimal(5, repairObj.getRepair_total_cost());
            st.setString(6, repairObj.getRep_additional_notes());
            st.setInt(7, repairObj.getRep_id());
            operations = st.executeUpdate();
            st.close();
            cn.close();
            System.out.println(operations + "operations executed");
            return true;
        }catch(SQLException e){
            System.out.println("Update in repair table ID: " + repairObj.getRep_id() + " failed " + e);
        }
        return false;
    }

    public boolean delete(Repair repairObj, User userObj){
        Connection cn = Connect.connect(userObj);
        String query = "DELETE FROM reparacion WHERE rep_id=?";
        int operations;
        try(PreparedStatement st = cn.prepareStatement(query)){
            st.setInt(1, repairObj.getRep_id());
            operations = st.executeUpdate();
            st.close();
            cn.close();
            System.out.println(operations + "operations executed");
            return operations > 0;
        }catch(SQLException e){
            System.out.println("Delete of " + repairObj.getRep_id() + " in repair table failed " + e);
        }
        return false;
    }
}
