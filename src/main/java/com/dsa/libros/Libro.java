package com.dsa.libros;

import java.util.Objects;
import java.util.StringTokenizer;

public class Libro {
  private String titulo;
  private String autor;
  private int clave;

  public Libro(String titulo, String autor, int clave) {
    this.titulo = titulo;
    this.autor = autor;
    this.clave = clave;
  }

  public static void main(String[] args) {
    Libro l = new Libro("Don Quijote, Cervantes Fco, 1");
    System.out.println(l);
    Libro l1 = new Libro("Don Quijote", "Cervantes", 1);
    System.out.println(l1);
    System.out.println();

    Libro l2 = new Libro("knuth", "El arte de programar", 2);
    System.out.println("Son igulaes\n" + l1 + " y \n" + l2 + "\n" + l1.equals(l2) + "\n");
    String s = "Cervantes";
    System.out.println("Son igulaes\n" + l1 + " y\n " + s + "\n" + l1.equals(s) + "\n");
    Libro b = null;
    System.out.println("Son iguales\n" + l1 + " y " + "null" + "\n" + l1.equals(b) + "\n");
    System.out.println("Son iguales\n" + l1 + " y " + l1 + "\n" + l1.equals(l1) + "\n");
    // Clonación de l1
    Libro copiaL1 = (Libro) l1.clone();
    System.out.println("Son igulaes\n" + l1 + " y uno igual " + "\n" + l1.equals(copiaL1) + "\n");
    Object copiaL2O = l2.clone();
    System.out.println("Son iguales\n" + l2 + " y " + copiaL2O + "\n" + l2.equals(copiaL2O) + "\n");
  }

  Libro(Object o) {
    String cadena = (String) o;
    StringTokenizer st = new StringTokenizer(cadena, ",");
    titulo = st.nextToken();
    autor = st.nextToken();
    clave = Integer.valueOf(st.nextToken().trim());
  }

  @Override
  public String toString() {
    return "Libro [titulo =" + titulo + ", autor=" + autor + ", clave=" + clave + "]";
  }

  @Override
  public boolean equals(Object obj) { // checa la igualdad entre datos miembros en vez de checar referencias.
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final Libro other = (Libro) obj;
    if (this.clave != other.clave) {
      return false;
    }
    if (!Objects.equals(this.titulo, other.titulo)) {
      return false;
    }
    return Objects.equals(this.autor, other.autor);
  }

  @Override
  public Object clone() {
    return new Libro(this.titulo, this.autor, this.clave);
  }
}
