package org.example;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "producto")
@DiscriminatorColumn(name = "tipo")
@Getter
@Setter
public abstract class Producto {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(name = "nombre")
  private String nombre;
  @Column(name = "marca")
  private String marca;

  public Producto() {
  }

  public Producto(String nombre, String marca) {
    this.nombre = nombre;
    this.marca = marca;
  }

  public abstract double precio();
  public abstract int stock();

  public void setId(Long id) {
    this.id = id;
  }

  public Long getId() {
    return id;
  }
}
