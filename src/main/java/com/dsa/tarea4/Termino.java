package com.dsa.tarea4;
import com.dsa.nodos.NodoDoble;

public class Termino implements Comparable<Termino>{
  private int exponente;
  private int coeficiente;

  public Termino(int coeficiente, int exponente) {
    if(exponente < 0) 
      throw new Error("No pueden ser exponentes negativos");
    this.coeficiente = coeficiente;
    this.exponente = exponente;
  }

  @Override
  public int compareTo(Termino t) {
    // Orden de exponente descendente
    if (this.exponente > t.exponente)
      return -1;
    if (this.exponente < t.exponente)
      return 1;
    return 0;
  }

  public int getExponente() {
    return exponente;
  }

  public void setExponente(int exponente) {
    this.exponente = exponente;
  }

  public int getCoeficiente() {
    return coeficiente;
  }

  public void setCoeficiente(int coeficiente) {
    this.coeficiente = coeficiente;
  }

  @Override
  public String toString() {
    String str = "";
    if(coeficiente == 0)
      return str;
    if(coeficiente > -1)
      str +=  "+" ;

    if(coeficiente != 1 && exponente != 0)
      str  += coeficiente + "x^" + exponente;
    else if(exponente == 0)
      str += coeficiente;
    else  
      str += "x^" + exponente;
    return str;
  }

}
