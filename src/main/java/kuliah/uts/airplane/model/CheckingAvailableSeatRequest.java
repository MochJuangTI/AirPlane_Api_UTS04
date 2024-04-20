package kuliah.uts.airplane.model;

import jakarta.validation.constraints.NotBlank;

import java.util.Date;

public class CheckingAvailableSeatRequest {
    @NotBlank
    public String destination_id;
    @NotBlank
    public Date date;
}
