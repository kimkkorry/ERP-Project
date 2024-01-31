package ERP.DATA.QC.Qul;
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
public class Qulilty {

	@Id
	private String Ql_Num;
	
	@Column(columnDefinition = "DATE NOT NULL")
	private String Ql_Date;
	
	@Column(length = 20)
	private String Ql_Name;
	
	@Column(length = 10)
	private String Ql_Code;
	
	@Column(length = 200)
	private String Ql_Thing;
	
	@Column(length = 150)
	private String Ql_TCode;
	
	@Column(columnDefinition = "NUMERIC(3) NOT NULL")
	private Integer Ql_Count;
	
	@Column(length = 5)
	private String Ql_Close;
}
