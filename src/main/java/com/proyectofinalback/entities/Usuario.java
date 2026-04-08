package com.proyectofinalback.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor 
@AllArgsConstructor 
@Data
@Builder
@Table(name = "usuario")
public class Usuario {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_usuario")
  private Long id;

  @Column(name = "nombre", nullable = false, length = 100)
  private String nombre;

  @Column(name = "apellidos", nullable = false, length = 150)
  private String apellidos;

  @Column(name = "dni_nie", nullable = false, length = 20, unique = true)
  private String dniNie;

  @Column(name = "direccion", length = 255)
  private String direccion;

  @Column(name = "codigo_postal")
  private Integer codigoPostal;

  @Column(name = "telefono")
  private Integer telefono;

  @Column(name = "correo", nullable = false, length = 150, unique = true)
  private String correo;

  @Column(name = "contrasena", nullable = false, length = 255)
  private String contrasena;

  @ManyToOne(optional = false)
  @JoinColumn(name = "id_rol", nullable = false)
  private Rol rol;

  /**
   * Si el usuario es un agente, tendrá perfil de agente asociado.
   */
  @OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL)
  private Agente agente;
}
