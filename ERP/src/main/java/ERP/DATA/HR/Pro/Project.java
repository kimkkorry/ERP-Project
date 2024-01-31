package ERP.DATA.HR.Pro;

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
public class Project {

	@Id
	private String PR_Num;
	
	@Column(length = 30)
	private String PR_Name;
	
	@Column(length = 10)
	private String PR_Team;
	
	@Column(length = 10)
	private String PR_TL;
	
	@Column(length = 100)
	private String PR_TM;
}
