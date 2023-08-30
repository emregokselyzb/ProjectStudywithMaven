import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder

public class Dish {
    private String name;
    private boolean vegeterian;
    private int Calories;
    private Type type;


}
