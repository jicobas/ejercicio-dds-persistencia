package org.example;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
//@Table(name = "descuentofijo")
@DiscriminatorValue("descuentofijo")
@Getter
@Setter
public class DescuentoFijo extends Decorado{

  @Column(name = "valor")
  private double valor;

  public DescuentoFijo(String nombre, String marca, double valor, Producto producto) {
    super(nombre, marca);
    this.valor = valor;
    this.producto = producto;
  }

  public DescuentoFijo() {
  }

  @Override
  public double precio() {
    return producto.precio() - valor;
  }

}
