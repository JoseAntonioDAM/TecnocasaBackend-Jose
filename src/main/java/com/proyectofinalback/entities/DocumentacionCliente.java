package com.example.tecnocasa.entity;

import java.time.LocalDate;

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
@Table(name = "documentacion_cliente")
@Data
@NoArgsConstructor 
@AllArgsConstructor 
@Builder
public class DocumentacionCliente {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_doc")
  private Long idDoc;

  @Column(name = "tipo", nullable = false, length = 50)
  private String tipo;

  @Column(name = "archivo", nullable = false, length = 255)
  private String archivo;

  @Column(name = "fecha", nullable = false)
  private LocalDate fecha;

  @ManyToOne(optional = false)
  @JoinColumn(name = "id_usuario", nullable = false)
  private Usuario usuario;
}
