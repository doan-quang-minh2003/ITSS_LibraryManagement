package librarymanagementsystem.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import librarymanagementsystem.DTO.QLAdminDTO;
import librarymanagementsystem.Toolkit.DBConnection;
import librarymanagementsystem.Toolkit.PasswordHashing;

public class QLAdminDAO {
	DBConnection DBAdmin;
	
	public ArrayList<QLAdminDTO> readDB(){
        DBAdmin = new DBConnection();
        ArrayList<QLAdminDTO> arrAdmin = new ArrayList<>();
        
        try{
            String query = "SELECT * FROM Admin";
            ResultSet rs = DBAdmin.SQLQuery(query);
            if (rs != null){
                while (rs.next()){
                    String tkAdmin = rs.getString("tkAdmin");
                    String password = rs.getString("password_hashed"); 
                    String salt = rs.getString("salt");
                    arrAdmin.add(new QLAdminDTO(tkAdmin, password, salt));
                }
            }

        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Lỗi!!! Lỗi đọc dữ liệu bảng Admin");
        } 
        finally{
            DBAdmin.closeConnection();
        }
        return arrAdmin;
    }
	
	public Boolean add(QLAdminDTO admin){
        DBAdmin = new DBConnection();
        Boolean check = DBAdmin.SQLUpdate("INSERT INTO Admin(tkAdmin, password_hashed, salt) "
                + "VALUES ('"
                + admin.getTkAdmin() + "', '" 
                + new PasswordHashing().getSalt() + "');");
        DBAdmin.closeConnection();
        return check;
    }
	
	public Boolean del(String tkAdmin){
        DBAdmin = new DBConnection();
        Boolean check = DBAdmin.SQLUpdate("DELETE FROM Admin WHERE Admin.tkAdmin = '" + tkAdmin + "'");
        DBAdmin.closeConnection();
        return check;
    }
	
    public Boolean mod(QLAdminDTO admin){
        DBAdmin = new DBConnection();
        Boolean check = DBAdmin.SQLUpdate("Update Admin Set "
                + "', password_hashed='" + admin.getTkAdmin()
                + " where tkAdmin='" + admin.getPassword() + "'");
        DBAdmin.closeConnection();
        return check;
    }
    
    public static void main(String[] args) {
        new QLAdminDAO().add(new QLAdminDTO("AD000002", "123123"));
    }
}
