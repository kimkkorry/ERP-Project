package ERP.DATA.Dis.Cont;
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
public class Contract {

	@Id
	private String CT_Code;
	
	@Column(length = 50)
	private String CT_Name;
	
	@Column(length = 12)
	private String CT_Date;
	
	@Column(length = 30)
	private String CT_Com;
	
	@Column(length = 50)
	private String CT_Ccode;
	
	@Column(length = 200)
	private String CT_Thing;
	
	@Column(length = 150)
	private String CT_Tcode;
	
	@Column(columnDefinition = "NUMERIC(3) NOT NULL")
	private Integer CT_Count;
	
	@Column(columnDefinition = "NUMERIC(7) NOT NULL")
	private Integer CT_Price;
	
	@Column(columnDefinition = "NUMERIC(13,2) NOT NULL")
	private Double CT_CP;
	
	@Column(columnDefinition = "NUMERIC(4,2) NOT NULL")
	private float VAT;
	
	@Column(columnDefinition = "NUMERIC(13,2) NOT NULL")
	private Double CT_VAT;
	
	@Column(columnDefinition = "NUMERIC(13,2) NOT NULL")
	private Double CT_VATSUM;
	
	
	private LocalDateTime CT_StartDate;
	
	@Column(columnDefinition = "DATETIME NOT NULL")
	private String CT_Enddate;
	
	@Column(length = 10)
	private String CT_Ename;
	
	@Column(length = 20)
	private String CT_Ephone;
	
	@Column(length = 50)
	private String CT_Email;
	
	@Column(length = 13)
	private String CT_Enumber;
	
	@Column(length =10)
	private String CT_Edepart;
}
