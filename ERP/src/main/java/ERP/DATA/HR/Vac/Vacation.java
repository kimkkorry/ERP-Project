package ERP.DATA.HR.Vac;

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
public class Vacation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String VA_Code;
	
	@Column(columnDefinition = "NUMERIC(7) NOT NULL")
	private Integer VA_Year;
	
	@Column(length = 50)
	private String VA_Name;
	
	@Column(columnDefinition = "DATETIME NOT NULL")
	private String VA_Sdate;
	
	@Column(columnDefinition = "DATETIME NOT NULL")
	private String VA_Edate;
	
	@Column(columnDefinition = "NUMERIC(2) NOT NULL")
	private Integer VA_Count;
	
}
