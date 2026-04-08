package  com.proyectofinalback.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "rol")
@Data
@NoArgsConstructor 
@AllArgsConstructor 
@Builder

public class Rol {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_rol")
  private Long id;

  @Enumerated(EnumType.STRING)
  @Column(name = "nombre", nullable = false, length = 30, unique = true)
  private RolNombre nombre;
}
