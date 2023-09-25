package org.example;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
//@Table(name = "packaging")
@DiscriminatorValue("packaging")
@Getter
@Setter
public class Packaging extends Decorado{

  @Column(name = "precioPackaging")
  private double precioPackaging;

  public Packaging(String nombre, String marca, double precioPackaging, Producto producto) {
    super(nombre, marca);
    this.precioPackaging = precioPackaging;
    this.producto = producto;
  }

  public Packaging() {
    super();
  }

  @Override
    public double precio() {
      return producto.precio() + precioPackaging;
    }
}
