package ERP.DATA.PP.Item;

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
public class Item {

	@Id
	private String ITM_Code;
	
	@Column(length = 30)
	private String ITM_Name;
	
	@Column(length = 3)
	private String ITM_Group;
	
	@Column(length = 15)
	private String ITM_Standard;
	
	@Column(columnDefinition = "NUMERIC(7) NOT NULL")
	private Integer ITM_SPrice;
	
	@Column(columnDefinition = "NUMERIC(7) NOT NULL")
	private Integer ITM_RPrice;
	
	@Column(length = 5)
	private String ITM_Type;
	
	@Column(length = 10)
	private String ITM_Test;
}
