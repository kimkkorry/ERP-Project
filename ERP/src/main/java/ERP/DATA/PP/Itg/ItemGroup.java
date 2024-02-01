package ERP.DATA.PP.Itg;

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
public class ItemGroup {

	@Id
	private String IG_Code;
	
	@Column(length = 10)
	private String IG_Name;
}
