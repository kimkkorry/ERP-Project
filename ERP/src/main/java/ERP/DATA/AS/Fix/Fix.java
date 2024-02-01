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
	private String FIX_Num;
	
	@Column(columnDefinition = "DATE NOT NULL")
	private String FIX_Date;
	
	@Column(length = 50)
	private String FIX_Title;
	
	@Column(length = 500)
	private String FIX_Content;
	
	@Column(length = 10)
	private String FIX_PName;
	
	@Column(length = 13)
	private String FIX_PNum;
	
	@Column(length = 30)
	private String FIX_IName;
	
	@Column(length = 11)
	private String FIX_ICode;
	
	@Column(columnDefinition = "NUMERIC(7) NOT NULL")
	private Integer FIX_Price;
	
}
