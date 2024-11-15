package Controller;

import Connection.Connect;
import Entities.Customer;
import Entities.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class CtrlCustomer {
    
    public boolean add(Customer customerObj, User userObj){
        Connection cn = Connect.connect(userObj);
        String query = "INSERT INTO cliente (cliente_id, cliente_nombre, cliente_apellido_paterno, cliente_apellido_materno, cliente_telefono) VALUES (?, ?, ?, ?, ?);";
        int operations;
        try(PreparedStatement st = cn.prepareStatement(query)){
            st.setInt(1, 0);
            st.setString(2, customerObj.getName());
            st.setString(3, customerObj.getLastNameP());
            st.setString(4, customerObj.getLastNameM());
            st.setString(5, customerObj.getPhoneNumber());
            operations = st.executeUpdate();
            st.close();
            cn.close();
            System.out.println(operations + "operations executed");
            return true;
        }catch(SQLException e){
            System.out.println("Insert into client table failed " + e);
        }  
        return false;
    }
    
    public boolean update(Customer customerObj, User userObj){
        Connection cn = Connect.connect(userObj);
        String query = "UPDATE cliente SET cliente_nombre=?, cliente_apellido_paterno=?, cliente_apellido_materno=?, cliente_telefono=? WHERE cliente_id=?";
        int operations;
        try(PreparedStatement st = cn.prepareStatement(query)){
            st.setString(1, customerObj.getName());
            st.setString(2, customerObj.getLastNameP());
            st.setString(3, customerObj.getLastNameM());
            st.setString(4, customerObj.getPhoneNumber());
            st.setInt(5, customerObj.getId());
            operations = st.executeUpdate();
            st.close();
            cn.close();
            System.out.println(operations + "operations executed");
            return true;
        }catch(SQLException e){
            System.out.println("Update in client table ID: " + customerObj.getId() + " failed " + e);
        }  
        return false;
    }

    public boolean delete(Customer customerObj, User userObj){
        Connection cn = Connect.connect(userObj);
        String query = "DELETE FROM cliente WHERE cliente_id=?";
        int operations;
        try(PreparedStatement st = cn.prepareStatement(query)){
            st.setInt(1, customerObj.getId());
            operations = st.executeUpdate();
            st.close();
            cn.close();
            System.out.println(operations + " operations executed");
            return true;
        }catch(SQLException e){
            System.out.println("Delete of " + customerObj.getId() + " in client table failed " + e);
        }
        return false;
    }
}
