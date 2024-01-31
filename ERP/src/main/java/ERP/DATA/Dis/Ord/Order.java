package ERP.DATA.Dis.Ord;

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
public class Order {

	@Id
	private Integer OR_Num;
	
	@Column(columnDefinition = "DATETIME NOT NULL")
	private String OR_Date;
	
	@Column(length = 200)
	private String OR_Thing;
	
	@Column(length = 150)
	private String OR_Tcode;
	
	@Column(length = 30)
	private String OR_Cname;
	
	@Column(length = 50)
	private String OR_Ccode;
	
	@Column(columnDefinition = "NUMERIC(3) NOT NULL")
	private Integer OR_Count;
	
	@Column(columnDefinition = "NUMERIC(7) NOT NULL")
	private Integer OR_Price;
	
	@Column(columnDefinition = "NUMERIC(4,2) NOT NULL")
	private float VAT;
	
	@Column(columnDefinition = "NUMERIC(13,2) NOT NULL")
	private Double OR_CP;
	
	@Column(columnDefinition = "NUMERIC(13,2) NOT NULL")
	private Double OR_VAT;
	
	@Column(columnDefinition = "NUMERIC(13,2) NOT NULL")
	private Double OR_VATSUM;
	
	@Column(columnDefinition = "DATETIME NOT NULL")
	private String DeliDate;
	
}
