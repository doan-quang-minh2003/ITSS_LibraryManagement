package librarymanagementsystem.DTO;

public class QLAdminDTO {
	String tkAdmin, password, salt;
	
    public QLAdminDTO(String tkAdmin, String password){
        this.tkAdmin = tkAdmin;
        this.password = password;
    }
    
    public QLAdminDTO(String tkAdmin, String password, String salt){
        this.tkAdmin = tkAdmin;
        this.password = password;
        this.salt = salt;
    }
    
    public QLAdminDTO(QLAdminDTO admin){
        this.tkAdmin = admin.tkAdmin;
        this.password = admin.password;
        this.salt = salt;
    }

	public String getTkAdmin() {
		return tkAdmin;
	}

	public void setTkAdmin(String tkAdmin) {
		this.tkAdmin = tkAdmin;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }
}
