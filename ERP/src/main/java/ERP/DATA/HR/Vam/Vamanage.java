package ERP.DATA.HR.Vam;

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
public class Vamanage {

	@Id
	private String VM_Num;
	
	@Column(columnDefinition = "DATE NOT NULL")
	private String VM_Adate;
	
	@Column(columnDefinition = "DATE NOT NULL")
	private String VM_Sdate;
	
	@Column(columnDefinition = "DATE NOT NULL")
	private String VM_Edate;
	
	@Column(length = 50)
	private String VM_Name;
	
	@Column(length = 50)
	private String VM_Detail;
	
	@Column(length = 10)
	private String VM_EName;
	
	@Column(length = 13)
	private String VM_ENum;
	
	@Column(columnDefinition = "NUMERIC(7) NOT NULL")
	private Integer VM_Count;
	
	@Column(length = 1)
	private String VM_Use;
}
