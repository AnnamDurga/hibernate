package p5;

import javax.persistence.Embeddable;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable

public class Parent {
	private @Getter @Setter String fatherName;
    private @Getter @Setter String motherName;
    private @Getter @Setter long phoneNumber;

}
