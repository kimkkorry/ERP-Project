package ERP.DATA.PP.Wod;

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
public class Workorder {

	@Id
	private String WO_Num;
	
	@Column(length = 30)
	private String WO_DeAc;
	
	@Column(length = 30)
	private String WO_Project;
	
	@Column(length = 10)
	private String WO_EName;
	
	@Column(columnDefinition = "DATE NOT NULL")
	private String WO_DeliDate;
	
	@Column(length = 30)
	private String WO_OThing;
	
	@Column(columnDefinition = "NUMERIC(3) NOT NULL")
	private Integer WO_OCount;
	
	@Column(columnDefinition = "NUMERIC(3) NOT NULL")
	private Integer WO_PCount;
	
	@Column(columnDefinition = "TYNYINT(1)")
	private String WO_Progress;
	
	@Column(columnDefinition = "NUMERIC(3) NOT NULL")
	private Integer WO_RCount;
	
	@Column(columnDefinition = "NUMERIC(3) NOT NULL")
	private Integer WO_Inven;
}
