package com.example.tecnocasa.entity;

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
@Table(name = "suelo")
@Data
@NoArgsConstructor
@AllArgsConstructor 
@Builder
public class Suelo {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_suelo")
  private Long idSuelo;

  @Column(name = "tipo_suelo", nullable = false, length = 50)
  private String tipoSuelo;
}
