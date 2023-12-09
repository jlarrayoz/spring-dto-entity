package uy.org.jlarrayoz.springdtoentity.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Column(length = 10)
    private String documento;

    @NotNull
    @NotEmpty
    @Column(length = 40)
    private String nombre;

    @NotNull
    @NotEmpty
    @Column(length = 40)
    private String apellido;
}
