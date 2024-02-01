package ERP.DATA.MM.Inv;

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
public class Inventory {

	@Id
	private String IN_Date;
	
	@Column(length = 10)
	private String IN_PName;
	
	@Column(length = 13)
	private String IN_PNum;
	
	@Column(length = 30)
	private String IN_IName;
	
	@Column(length = 11)
	private String IN_ICode;
	
	@Column(columnDefinition = "NUMERIC(7) NOT NULL")
	private Integer IN_BQ;
	
	@Column(columnDefinition = "NUMERIC(7) NOT NULL")
	private Integer IN_AQ;
	
	@Column(length = 50)
	private String IN_Standard;
}
