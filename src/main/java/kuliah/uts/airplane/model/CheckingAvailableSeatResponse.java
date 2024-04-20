package kuliah.uts.airplane.model;

import jakarta.validation.constraints.NotBlank;
import kuliah.uts.airplane.entity.Destination;

import java.util.Date;
import java.util.List;

public class CheckingAvailableSeatResponse {
    @NotBlank
    public Destination destination;
    @NotBlank
    public Date date;
    @NotBlank
    public List<Seat> seats;
}

class Seat {
    @NotBlank
    public Number Integer;
    @NotBlank
    public Boolean Available ;
}
