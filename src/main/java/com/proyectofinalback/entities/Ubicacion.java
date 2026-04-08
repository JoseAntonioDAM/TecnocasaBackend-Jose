package com.proyectofinalback.entities;

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
@Table(name = "ubicacion")
@Data
@NoArgsConstructor 
@AllArgsConstructor 
@Builder
public class Ubicacion {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_ubicacion")
  private Long idUbicacion;

  @Column(name = "direccion", nullable = false, length = 100)
  private String direccion;

  @Column(name = "ciudad", nullable = false, length = 80)
  private String ciudad;

  @Column(name = "pais", nullable = false, length = 80)
  private String pais;

  @Column(length = 500)
  private String googleMapsUrl; 

  @Column(length = 50)
  private String municipio;
}
