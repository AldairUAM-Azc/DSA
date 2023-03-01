package com.dsa.app;

public class Gato {
  private String nombre;

  public Gato(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  @Override
  public String toString() {
    return "Gato [nombre=" + nombre + "]";
  }

  
}
