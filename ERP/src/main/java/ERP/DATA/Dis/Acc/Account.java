package ERP.DATA.Dis.Acc;

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

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer AC_Num;
	
	@Column(length = 30)
	private String AC_Cname;
	
	@Column(length = 12)
	private String AC_Cnum;
	
	@Column(length = 100)
	private String AC_Address;
	
	@Column(length = 70)
	private String AC_Rname;
	
	@Column(length = 20)
	private String AC_Rphone;
	
	@Column(length = 200)
	private String AC_Thing;
	
	@Column(length = 150)
	private String AC_Tcode;
	
	@Column(length = 7)
	private Integer AC_Price;
	
	@Column(columnDefinition = "NUMERIC(4,2) NOT NULL")
	private float VAT;
	
	@Column(length = 10)
	private String AC_Tdate;
}
