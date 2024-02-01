package ERP.DATA.PP.BOM;

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
public class BOM {

	@Id
	private String BOM_Num;
	
	@Column(length = 11)
	private String BOM_PCode;
	
	@Column(columnDefinition = "NUMERIC(3) NOT NULL")
	private Integer BOM_PCount;
	
	@Column(length = 11)
	private String BOM_CCode;
	
	@Column(columnDefinition = "NUMERIC(3) NOT NULL")
	private Integer BOM_CCount;
	
	@Column(length = 7)
	private String BOM_Process;
	
}
