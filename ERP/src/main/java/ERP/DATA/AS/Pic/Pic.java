package ERP.DATA.AS.Pic;

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
public class Pic {

	@Column(length = 10)
	private String PIC_Name;
	
	@Column(length = 13)
	private String PIC_Num;
}
