package Controller;

import Connection.Connect;
import Entities.Vehicle;
import Entities.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CtrlVehicle {

    public boolean add(Vehicle vehicleObj, User userObj){
        Connection cn = Connect.connect(userObj);
        String query = "INSERT INTO vehiculo (id_vehiculo, cliente_id, marca_vehiculo, anio_vehiculo, modelo_vehiculo) VALUES (?, ?, ?, ?, ?);";
        int operations;
        try(PreparedStatement st = cn.prepareStatement(query)){
            st.setInt(1, 0);
            st.setInt(2, vehicleObj.getClient_id());
            st.setString(3, vehicleObj.getVehicle_brand());
            st.setInt(4, vehicleObj.getYear());
            st.setString(5, vehicleObj.getVehicle_model());
            operations = st.executeUpdate();
            st.close();
            cn.close();
            System.out.println(operations + "operations executed");
            return true;
        }catch(SQLException e){
            System.out.println("Insert into vehicle table failed " + e);
        }
        return false;
    }

    public boolean update(Vehicle vehicleObj, User userObj){
        Connection cn = Connect.connect(userObj);
        String query = "UPDATE vehiculo SET cliente_id=?, marca_vehiculo=?, anio_vehiculo=?, modelo_vehiculo=? WHERE id_vehiculo=?";
        int operations;
        try(PreparedStatement st = cn.prepareStatement(query)){
            st.setInt(1, vehicleObj.getClient_id());
            st.setString(2, vehicleObj.getVehicle_brand());
            st.setInt(3, vehicleObj.getYear());
            st.setString(4, vehicleObj.getVehicle_model());
            st.setInt(5, vehicleObj.getVehicle_id());
            operations = st.executeUpdate();
            st.close();
            cn.close();
            System.out.println(operations + " operations executed");
            return true;
        }catch (SQLException e){
            System.out.println("Update in vehicle table ID: " + vehicleObj.getVehicle_id() + " failde " + e);
        }
        return false;
    }

    public boolean delete(Vehicle vehicleObj, User userObj){
        Connection cn = Connect.connect(userObj);
        String query = "DELETE FROM vehiculo WHERE id_vehiculo=?";
        int operations;
        try(PreparedStatement st = cn.prepareStatement(query)){
                st.setInt(1, vehicleObj.getVehicle_id());
                operations = st.executeUpdate();
                st.close();
                cn.close();
                System.out.println(operations + " operations excecuted");
                return operations > 0;
        }catch (SQLException e){
            System.out.println("Delete of " + vehicleObj.getVehicle_id() + " in cliente table failed " + e);
        }
        return false;
    }
}
