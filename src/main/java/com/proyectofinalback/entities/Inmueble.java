package com.proyectofinalback.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "inmueble")
@Data
@NoArgsConstructor 
@AllArgsConstructor 
@Builder
public class Inmueble {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_inmueble")
  private Long idInmueble;

  @Column(name = "tipo", nullable = false, length = 50)
  private String tipo;

  @Column(name = "area", precision = 10, scale = 2)
  private BigDecimal area;

  @Column(name = "estado", length = 50)
  private String estado;

  @ManyToOne(optional = false)
  @JoinColumn(name = "id_ubicacion", nullable = false)
  private Ubicacion ubicacion;

  @ManyToOne
  @JoinColumn(name = "id_suelo")
  private Suelo suelo;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "id_precio")
  private Precio precio;

  @OneToMany(mappedBy = "inmueble", cascade = CascadeType.ALL, orphanRemoval = true)
  @Builder.Default
  private List<DocumentacionInmueble> documentacion = new ArrayList<>();

  @OneToMany(mappedBy = "inmueble", cascade = CascadeType.ALL, orphanRemoval = true)
  @Builder.Default
  private List<Factura> facturas = new ArrayList<>();
}
