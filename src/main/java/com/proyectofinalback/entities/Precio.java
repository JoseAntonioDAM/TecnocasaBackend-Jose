package com.proyectofinalback.entities;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "precio")
@Data 
@NoArgsConstructor 
@AllArgsConstructor 
@Builder
public class Precio {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_precio")
  private Long idPrecio;

  @Column(name = "moneda", nullable = false, length = 10)
  private String moneda;

  @Column(name = "monto", nullable = false, precision = 10, scale = 2)
  private BigDecimal monto;
}
