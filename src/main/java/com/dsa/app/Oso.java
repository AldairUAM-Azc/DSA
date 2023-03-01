package com.dsa.app;
import java.util.Scanner;

public class Oso {
  private String nombre;
  private String especie;
  private int edad;

  public Oso(String nombre, String especie, int edad) {
    this.nombre = nombre;
    this.especie = especie;
    this.edad = edad;
  }

  public Oso(){
    Scanner s = new Scanner(System.in);
    System.out.println("Nombre: ");
    String nombre = s.nextLine();
    this.nombre = nombre;
    System.out.println("Especie: ");
    String especie = s.nextLine();
    this.especie = especie;
    System.out.println("Edad: ");
    int edad = s.nextInt();
    this.edad = edad;
    s.close();
  }

  @Override
  public String toString() {
    return "Oso [nombre=" + nombre + ", especie=" + especie + ", edad=" + edad + "]";
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getEspecie() {
    return especie;
  }

  public void setEspecie(String especie) {
    this.especie = especie;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  

  
}
