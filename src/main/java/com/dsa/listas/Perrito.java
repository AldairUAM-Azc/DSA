package com.dsa.listas;

public class Perrito implements Comparable<Perrito>{
  private String nombre;
  private int edad;

  public Perrito(String nombre, int edad){
    this.nombre = nombre;
    this.edad = edad;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  @Override
  public int compareTo(Perrito p) {
    if(this.edad > p.getEdad()) return 1;
    else if (this.edad < p.getEdad()) return -1;  
    return this.getNombre().compareTo(p.getNombre());
  }
}
