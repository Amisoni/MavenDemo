package maven.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id")
	    private int id;

	    @Column(name = "first_name")
	    private String firstName;

	    @Column(name = "last_name")
	    private String lastName;
	    
	    @Column(name = "DateOfBirth")
	    private String DateOfBirth;
	    
	 
	    @Column(name = "Username")
	    private String Username;
	    
	    @Column(name = "Password")
	    private String Password;
	    
	    @Column(name = "email")
	    private String email;

	    public Customer() {

	    }

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getFirstName() {
	        return firstName;
	    }

	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	  

		public String getDateOfBirth() {
			return DateOfBirth;
		}

		public void setDateOfBirth(String dateOfBirth) {
			DateOfBirth = dateOfBirth;
		}

		public String getUsername() {
			return Username;
		}

		public void setUsername(String username) {
			Username = username;
		}

		public String getPassword() {
			return Password;
		}

		public void setPassword(String password) {
			Password = password;
		}

		@Override
	    public String toString() {
	        return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ",DateOfBirth="+ DateOfBirth +",Username=" + Username + ",Password=" + Password + ", email=" + email + "]";
	    }
}
