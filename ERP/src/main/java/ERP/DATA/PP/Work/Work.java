package ERP.DATA.PP.Work;

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
public class Work {

	@Id
	private String WK_Num;
	
	@Column(columnDefinition = "DATE NOT NULL")
	private String WK_Date;
	
	@Column(length = 30)
	private String WK_PThing;
	
	@Column(length = 15)
	private String WK_Name;
	
	@Column(length = 30)
	private String WK_Thing;
	
	@Column(columnDefinition = "NUMERIC(6) NOT NULL")
	private Integer WK_Count;
	
	@Column(length = 10)
	private String WK_Location;
	
	@Column(length = 10)
	private String WK_Resource;
	
	@Column(columnDefinition = "NUMERIC(3) NOT NULL")
	private Integer WK_WorkHour;
	
	@Column(length = 15)
	private String WK_WoNum;
}
