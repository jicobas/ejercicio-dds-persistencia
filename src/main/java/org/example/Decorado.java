package org.example;

public abstract class Decorado extends Producto {

  protected Producto producto;

  public Decorado(String nombre, String marca) {
    super(nombre, marca);
  }

  public Decorado() {
  }

  public abstract double precio();
  public int stock(){
    return producto.stock();
  }
}
