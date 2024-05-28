package entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "users")
public class user {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String email;
    private Date startDate;
    private Date endDate;

    public user() {
    	
    }
    
    public user(String username,String email,Date startDate, Date endDate) {
    	this.username = username;
    	this.email = email;
    	this.startDate = startDate;
    	this.endDate = endDate;
 
   }
    
   public long getId() {
	   return id;
   }
   
   public void setId(long id) {
	   this.id = id;
   }
   
   public String getUserName() {
	   return username;
   }
   
   public void setUserName(String username) {
	   this.username = username;
   }
   
   public String getEmail() {
	   return email;
   }
   
   public void setEmail(String email) {
	   this.email = email;
   }
   
   public Date getStartDate() {
	   return startDate;
   }
   
   public void setStartDate(Date startDate) {
	   this.startDate = startDate;
   }
   
   public Date getEndtDate() {
	   return endDate;
   } 
   
   public void setEndDate(Date endDate) {
	   this.endDate = endDate;
   }
    // Constructors, getters, and setters
}



