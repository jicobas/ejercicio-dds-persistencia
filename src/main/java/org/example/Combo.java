package org.example;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Transient;
import lombok.Getter;
import lombok.Setter;


@Entity
//@Table(name = "combo")
@DiscriminatorValue("combo")
@Getter
@Setter
public class Combo extends Producto{

  @Transient
  List<Producto> productos = new ArrayList<Producto>();

  public Combo(String nombre, String marca) {
    super(nombre, marca);
  }

  public Combo() {
  }

  public void addProducto(Producto producto){
    productos.add(producto);
  }

  @Override
  public double precio() {
    double precio = 0;
    for (Producto producto : productos) {
      precio += producto.precio();
    }
    return precio;
  }

  @Override
  public int stock() {
    int stock = 0;
    for (Producto producto : productos) {
      stock += producto.stock();
    }
    return stock;
  }

}
