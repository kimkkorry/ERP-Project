package ERP.DATA.PP.Pro;

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
public class Process {

	@Id
	private String PC_Code;
	
	@Column(length = 10)
	private String PC_Name;
	
	@Column(length = 10)
	private String PC_Resource;
	
	@Column(length = 10)
	private String PC_Location;
}
