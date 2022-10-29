package p5;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Embeddable

public class Vaccination {
	
	  private @Getter @Setter String doseName;
	    private @Getter @Setter String vaccinationDate;
	    private @Getter @Setter String nextDoseName;
	    private @Getter @Setter String nextVaccinationDate;
	    private @Getter @Setter String remarks;
	    private @Getter @Setter int cost;


	
}
