package ERP.DATA.PP.Sto;

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
public class Stock {

	@Id
	private String STO_Num;
	
	@Column(columnDefinition = "DATE NOT NULL")
	private String STO_Date;
	
	@Column(length = 30)
	private String STO_PLocation;
	
	@Column(length = 30)
	private String STO_InStore;
	
	@Column(length = 30)
	private String STO_Thing;
	
	@Column(columnDefinition = "NUMERIC(6) NOT NULL")
	private Integer STO_Count;
	
	@Column(length = 30)
	private String STO_CsThing;
	
	@Column(columnDefinition = "NUMERIC(6) NOT NULL")
	private Integer STO_CsCount;
	
	@Column(length = 15)
	private String STO_WoNum;
}
