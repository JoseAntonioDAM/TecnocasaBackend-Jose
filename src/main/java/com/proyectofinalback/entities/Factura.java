package main.java.com.proyectofinalback.entities;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.example.tecnocasa.entity.Inmueble;
import com.example.tecnocasa.entity.Usuario;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "factura")
@Data
@NoArgsConstructor 
@AllArgsConstructor 
@Builder
public class Factura {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_factura")
  private Long idFactura;

  @Column(name = "numero", nullable = false, length = 200, unique = true)
  private String numero;

  @Column(name = "fecha", nullable = false)
  private LocalDate fecha;

  @Column(name = "total", nullable = false, precision = 10, scale = 2)
  private BigDecimal total;

  @ManyToOne(optional = false)
  @JoinColumn(name = "id_inmueble", nullable = false)
  private Inmueble inmueble;

  @ManyToOne
  @JoinColumn(name = "id_cliente")
  private Usuario cliente;
}
