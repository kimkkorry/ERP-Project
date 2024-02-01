package ERP.DATA.PP.BOR;

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
public class BOR {

	@Id
	private String BOR_Code;
	
	@Column(length = 10)
	private String BOR_Name;
	
	@Column(length = 11)
	private String BOR_PCode;
	
	@Column(columnDefinition = "NUMERIC(6) NOT NULL")
	private Integer BOR_PCount;
	
	@Column(length = 7)
	private String BOR_Process;
	
	@Column(columnDefinition = "NUMERIC(1) NOT NULL")
	private Integer BOR_WorkFlow;
	
	@Column(columnDefinition = "NUMERIC(3) NOT NULL")
	private Integer BOR_WorkHour;
}
