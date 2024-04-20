package kuliah.uts.airplane.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WebResponse<T> {
    public T data;
    private String errors;
}
