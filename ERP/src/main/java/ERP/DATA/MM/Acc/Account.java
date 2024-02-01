package ERP.DATA.MM.Acc;

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
public class Account {

	@Column(length = 30)
	private String AC_Name;
	
	@Column(length = 50)
	private String AC_Code;
	
}
