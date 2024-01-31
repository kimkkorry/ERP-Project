package ERP.DATA.HR.App;

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
public class Appointment {

	@Id
	private String AP_Num;
	
	@Column(columnDefinition = "DATETIME NOT NULL")
	private String AP_Date;
	
	@Column(length = 10)
	private String AP_Depart;
	
	@Column(length = 3)
	private String AP_Spot;
	
	@Column(length = 10)
	private String AP_Position;
	
	@Column(length = 10)
	private String AP_Name;
	
	@Column(length = 13)
	private String AP_ENum;
	
	@Column(length = 10)
	private String AP_ADepart;
	
	@Column(length = 3)
	private String AP_ASpot;
	
	@Column(length = 10)
	private String AP_APosition;
	
	@Column(length = 50)
	private String AP_Detail;
	
	@Column(length = 5)
	private String AP_Prom;
}
