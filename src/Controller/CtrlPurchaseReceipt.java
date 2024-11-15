package Controller;

import Connection.Connect;
import Entities.PurchaseReceipt;
import Entities.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CtrlPurchaseReceipt {

    public boolean add(PurchaseReceipt purchaseReceiptObj, User userObj){
        Connection cn = Connect.connect(userObj);
        String query = "INSERT INTO ticket (ticket_id, cliente_id, vehiculo_id, reparacion_id, tipo_reparacion_id, costo_total, observaciones_finales) VALUES(?, ?, ?, ?, ?, ?, ?);";
        int operations;

        try(PreparedStatement st = cn.prepareStatement(query)){
            st.setInt(1, 0);
            st.setInt(2, purchaseReceiptObj.getCustomer_id());
            st.setInt(3, purchaseReceiptObj.getVehicle_id());
            st.setInt(4, purchaseReceiptObj.getRepair_id());
            st.setInt(5, purchaseReceiptObj.getType_of_repair_id());
            st.setBigDecimal(6, purchaseReceiptObj.getTotal());
            st.setString(7, purchaseReceiptObj.getObservations());
            operations = st.executeUpdate();
            st.close();
            cn.close();
            System.out.println(operations + " operations excecuted");
            return true;
        }catch (SQLException e){
            System.out.println("Insert into repair table failed" + e);
        }
        return false;
    }

    public boolean update(PurchaseReceipt purchaseReceiptObj, User userObj){
        Connection cn = Connect.connect(userObj);
        String query = "UPDATE ticket SET cliente_id=?, vehiculo_id=?, reparacion_id=?, tipo_reparacion_id=?, costo_total=?, fecha_emision=? WHERE ticket_id=?";
        int operations;
        try(PreparedStatement st = cn.prepareStatement(query)){
            st.setInt(1, purchaseReceiptObj.getCustomer_id());
            st.setInt(2, purchaseReceiptObj.getVehicle_id());
            st.setInt(3, purchaseReceiptObj.getRepair_id());
            st.setInt(4, purchaseReceiptObj.getType_of_repair_id());
            st.setBigDecimal(5, purchaseReceiptObj.getTotal());
            st.setDate(6, purchaseReceiptObj.getEmission_date());
            st.setInt(7, purchaseReceiptObj.getTicket_id());
            operations = st.executeUpdate();
            st.close();
            cn.close();
            System.out.println(operations + " operations excecuted");
            return true;
        }catch(SQLException e){
            System.out.println("Update in repair table ID: " + purchaseReceiptObj.getTicket_id() + " failed " + e);
        }
        return false;
    }

    public boolean delete(PurchaseReceipt purchaseReceiptObj, User userObj){
        Connection cn = Connect.connect(userObj);
        String query = "DELETE FROM ticket WHERE ticket_id=?";
        int operations;
        try(PreparedStatement st = cn.prepareStatement(query)){
            st.setInt(1, purchaseReceiptObj.getTicket_id());
            operations = st.executeUpdate();
            st.close();
            cn.close();
            System.out.println(operations + " operations excecuted");
            return operations > 0;
        }catch(SQLException e){
            System.out.println("Delete of " + purchaseReceiptObj.getTicket_id() + " in repair table failed " + e);
        }
        return false;
    }

}
