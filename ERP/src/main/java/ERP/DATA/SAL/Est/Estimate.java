
package ERP.DATA.SAL.Est;

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
public class Estimate {

	@Id
	private String ES_Num;
	
	@Column(length = 30)
	private String ES_Cname;
	
	@Column(length = 50)
	private String ES_Ccode;
	
	@Column(length = 10)
	private String ES_Aname;
	
	@Column(length = 200)
	private String ES_Thing;
	
	@Column(length = 20)
	private String ES_Category;
	
	@Column(columnDefinition = "NUMERIC(13,2) NOT NULL")
	private Double ES_Sum;
	
	@Column(length = 5)
	private String ES_Situa;
}
