package com.proyectofinalback.entities;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "agente")
@Data
@AllArgsConstructor
@Builder
public class Agente {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_agente")
  private Long idAgente;

  @Column(name = "nombre", nullable = false, length = 50)
  private String nombre;

  @Column(name = "telefono")
  private Integer telefono;

  @Column(name = "email", length = 50)
  private String email;

  @OneToOne(optional = false)
  @JoinColumn(name = "id_usuario", nullable = false, unique = true)
  private Usuario usuario;
}
