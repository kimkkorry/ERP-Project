package ERP.DATA.HR.Dep;

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
public class Depart {

	@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Dep_Num;
	
	@Column(length = 10)
	private String Dep_Name;
}
