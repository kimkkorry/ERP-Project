package ERP.DATA.QC.Ter;
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
public class Testresult {

	@Id
	private String TR_Num;
	
	@Column(length = 20)
	private String TR_Method;
	
	@Column(length = 200)
	private String TR_Thing;
	
	@Column(length = 150)
	private String TR_TCode;
	
	@Column(columnDefinition = "NUMERIC(3) NOT NULL")
	private Integer TR_Count;
	
	@Column(columnDefinition = "NUMERIC(3) NOT NULL")
	private Integer TR_Pass;
	
	@Column(columnDefinition = "NUMERIC(3) NOT NULL")
	private Integer TR_Error;
	
	@Column(columnDefinition = "NUMERIC(5,2) NOT NULL")
	private Float TR_EP;
	
	@Column(length = 5)
	private String TR_Close;
	
	@Column(columnDefinition = "DATETIME NOT NULL")
	private String TR_CloseDate;
}
