package ERP.DATA.MM.Ite;
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

	@Column(length = 30)
	private String IT_Name;
	
	@Column(length = 11)
	private String IT_Code;
	
}
