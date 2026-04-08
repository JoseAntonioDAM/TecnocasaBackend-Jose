package com.example.tecnocasa.entity;

import java.time.LocalDate;

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
@Table(name = "registro")
@Data 
@NoArgsConstructor 
@AllArgsConstructor 
@Builder
public class Registro {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_registro")
  private Long idRegistro;

  @Column(name = "nombre", nullable = false, length = 100)
  private String nombre;

  /** Campo/propiedad registrada */
  @Column(name = "campo", nullable = false, length = 100)
  private String campo;

  /** Tipo del campo (en el diagrama aparece "Tipo") */
  @Column(name = "tipo", length = 60)
  private String tipo;

  @Column(name = "fecha")
  private LocalDate fecha;
}
