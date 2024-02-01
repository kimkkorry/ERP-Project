package ERP.DATA.AS.Fix;

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
public class Fix {

	@Id
	private String RE_Num;
	
	@Column(columnDefinition = "DATE NOT NULL")
	private String Re_Date;
	
	@Column(length = 50)
	private String Re_Title;
	
	@Column(length = 500)
	private String RE_Con;
}
