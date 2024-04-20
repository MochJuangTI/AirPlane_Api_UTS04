package kuliah.uts.airplane.model;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateOrupdateDestinationRequest {
    @NotBlank
    public String name;
    @NotBlank
    public String description;
    @NotBlank
    public String price;
    @NotBlank
    public Integer country_id;
    @NotBlank
    public String photos;
    @NotBlank
    public boolean insurance;
    @NotBlank
    public boolean refundable;
    @NotBlank
    public double vat;
}
