package com.dsa.tarea3;

import java.util.Scanner;

public class Complejo implements Comparable<Complejo> {
  private double real;
  private double i;
  private double modulo;

  public Complejo(double real, double i) {
    this.real = real;
    this.i = i;
    this.modulo = this.modulo();
  }

  public Complejo() {
    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca parte real: ");
    this.real = Double.parseDouble(s.nextLine().trim());
    System.out.println("Introduzca parte imaginario: ");
    this.i = Double.parseDouble(s.nextLine().trim());
    this.modulo = this.modulo();
  }

  public Complejo suma(Complejo c) {
    return new Complejo(this.real + c.real, this.i + c.i);
  }

  public Complejo resta(Complejo c) {
    return new Complejo(this.real - c.real, this.i - c.i);
  }

  public Complejo multiplica(Complejo c) {
    double real = this.real * c.real - this.i * c.i;
    double imaginario = this.real * c.i + this.i * c.real;
    return new Complejo(real, imaginario);
  }

  public Complejo divide(Complejo c) {
    double conjugado = Math.pow(c.real, 2) + Math.pow(c.i, 2);
    double real = (this.real * c.real + this.i * c.i) / conjugado;
    double imaginario = (this.i * c.real - this.real * c.i) / conjugado;
    return new Complejo(real, imaginario);
  }

  private double modulo() {
    return Math.pow(this.real * this.real + this.i * this.i, 0.5);
  }

  public double getModulo() {
    return modulo;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Complejo other = (Complejo) obj;
    if (Double.doubleToLongBits(real) != Double.doubleToLongBits(other.real))
      return false;
    if (Double.doubleToLongBits(i) != Double.doubleToLongBits(other.i))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "( " + this.real + " + " + this.i + " i )";
  }

  @Override
  public int compareTo(Complejo o) {
    if (this.modulo > o.modulo) {
      return 1;
    } else if (this.modulo < o.modulo) {
      return -1;
    } else {
      return 0;
    }
  }
}
