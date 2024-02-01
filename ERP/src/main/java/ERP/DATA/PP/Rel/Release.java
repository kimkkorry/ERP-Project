package ERP.DATA.PP.Rel;

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
public class Release {

	@Id
	private String REL_Num;
	
	@Column(columnDefinition = "DATE NOT NULL")
	private String REL_Date;
	
	@Column(length = 30)
	private String REL_OurStore;
	
	@Column(length = 30)
	private String REL_InStroe;
	
	@Column(length = 30)
	private String REL_Thing;
	
	@Column(columnDefinition = "NUMERIC(6) NOT NULL")
	private Integer REL_Count;
	
	@Column(length = 15)
	private String REL_WoNum;
}
