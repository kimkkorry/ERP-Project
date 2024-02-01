package ERP.DATA.HR.Com;

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
public class Commuit {

	@Id
	private String CM_Num;
	
	@Column(columnDefinition = "DATE NOT NULL")
	private String CM_Date;
	
	@Column(length = 10)
	private String CM_Depart;
	
	@Column(length = 13)
	private String CM_ENum;
	
	@Column(length = 10)
	private String CM_Name;
	
	@Column(columnDefinition = "DATETIME NOT NULL")
	private String Intime;
	
	@Column(columnDefinition = "DATETIME NOT NULL")
	private String Outtime;
	
	@Column(columnDefinition = "DATETIME NOT NULL")
	private String Worktime;
	
	@Column(length = 30)
	private String CM_Reason;
}
