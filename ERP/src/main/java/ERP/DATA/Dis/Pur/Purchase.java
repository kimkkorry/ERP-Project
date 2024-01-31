package ERP.DATA.Dis.Pur;

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
public class Purchase {

	@Id
	private Integer PC_Num;
	
	private LocalDateTime PC_Date;
	
	@Column(length = 30)
	private String PC_Cname;
	
	@Column(length = 50)
	private String PC_Cnum;
	
	@Column(length = 200)
	private String PC_thing;
	
	@Column(length = 150)
	private String PC_Tcode;
	
	@Column(length = 999)
	private String PC_Count;
	
	@Column(columnDefinition = "NUMERIC(7) NOT NULL")
	private Integer PC_Price;
	
	@Column(columnDefinition = "NUMERIC(13,2) NOT NULL")
	private Double PC_CP;
	
	@Column(columnDefinition = "NUMERIC(13,2) NOT NULL")
	private Double PC_VAT;
	
	@Column(columnDefinition = "NUMERIC(13,2) NOT NULL")
	private Double PC_VATSUM;
}
