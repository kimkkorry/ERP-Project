package ERP.DATA.HR.Lat;

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
public class Latework {

	@Id
	private String LW_Num;
	
	@Column(columnDefinition = "DATETIME NOT NULL")
	private String LW_Date;
	
	@Column(length = 10)
	private String LW_Name;
	
	@Column(length = 15)
	private String LW_ENum;
	
	@Column(length = 100)
	private String LW_Time;
}
