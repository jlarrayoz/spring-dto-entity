package uy.org.jlarrayoz.springdtoentity.dto;

import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonaDTO {

    @Id
    @NotNull
    private Long id;

    @NotNull
    @Length(max = 10)
    private String documento;

    @NotNull
    @NotEmpty
    @Length(max = 40)
    private String nombre;

    @NotNull
    @NotEmpty
    @Length(max = 40)
    private String apellido;
}
