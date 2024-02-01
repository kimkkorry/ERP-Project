package ERP.DATA.HR.Emp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Employee {

	@Id
	private Long Emp_num;
	
	@Column(length = 10)
	private String Emp_Name;
	
	@Column(length = 100)
	private String Emp_Add;
	
	@Column(length = 14)
	private String Emp_SSN;
	
	@Column(columnDefinition = "DATE NOT NULL")
	private String Emp_date;
	
	@Column(length = 3)
	private String Emp_Spot;
	
	@Column(length = 10)
	private String Emp_Position;
	
	@Column(length = 20)
	private String Emp_Phone;
	
	@Column(length = 50)
	private String Emp_mail;
	
	@Column(length = 10)
	private String Emp_Depart;
	
	@Column(length = 35)
	private String Emp_Anum;
}
