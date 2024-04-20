package kuliah.uts.airplane.model;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateBookingRequest {
    @NotBlank
    public Integer destination_id;
    @NotBlank
    public Integer customer_id;
    @NotBlank
    public List<Integer> seat;
}
