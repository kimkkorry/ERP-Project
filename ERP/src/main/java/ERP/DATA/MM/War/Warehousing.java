package ERP.DATA.MM.War;

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
public class Warehousing {

	@Id
	private String WH_Num;
	
	@Column(columnDefinition = "DATE NOT NULL")
	private String WH_WDate;
	
	@Column(length = 10)
	private String WH_PName;
	
	@Column(length = 13)
	private String WH_PNum;
	
	@Column(length = 30)
	private String WH_AName;
	
	@Column(length = 50)
	private String WH_Acode;
	
	@Column(length = 30)
	private String WH_IName;
	
	@Column(length = 11)
	private String WH_ICode;
	
	@Column(columnDefinition = "NUMERIC(7) NOT NULL")
	private Integer WH_CAmount;
	
	@Column(columnDefinition = "DATE NOT NULL")
	private String WH_DT;
}
