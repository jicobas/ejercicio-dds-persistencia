package org.example;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
//@Table(name = "productosimple")
@DiscriminatorValue("productosimple")
@Getter
@Setter
public class ProductoSimple extends Producto{
  private double precio;
  private int stock;

  public ProductoSimple(String nombre, String marca, double precio, int stock) {
    super(nombre, marca);
    this.precio = precio;
    this.stock = stock;
  }

  public ProductoSimple() {
  }

  @Override
  public double precio() {
    return precio;
  }

  @Override
  public int stock() {
    return stock;
  }

}
