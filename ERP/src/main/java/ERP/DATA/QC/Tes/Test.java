package ERP.DATA.QC.Tes;
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
public class Test {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String T_Code;
	
	@Column(length = 20)
	private String T_Name;
	
	@Column(columnDefinition = "DATE NOT NULL")
	private String T_Adddate;
}
