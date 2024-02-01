package ERP.DATA.MM.Shi;

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
public class Shipping {

	@Id
	private String SP_Num;
	
	@Column(columnDefinition = "DATE NOT NULL")
	private String SP_Sdate;
	
	@Column(length = 30)
	private String SP_AName;
	
	@Column(length = 50)
	private String SP_Acode;
	
	@Column(length = 10)
	private String SP_PName;
	
	@Column(length = 13)
	private String SP_PNum;
	
	
	@Column(length = 30)
	private String SP_IName;
	
	@Column(length = 11)
	private String SP_ICode;
	
	@Column(columnDefinition = "NUMERIC(7) NOT NULL")
	private Integer SP_CAmount;
	
	@Column(columnDefinition = "DATE NOT NULL")
	private String SP_DT;
	
	
}
