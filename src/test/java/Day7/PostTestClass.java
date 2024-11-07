package Day7;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@JsonIgnoreProperties(value = "incomplete",allowSetters = true)
public class PostTestClass {

   private int id,petId,quantity;
   private String shipDate,status;
   private boolean complete,incomplete;

}
