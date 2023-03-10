package com.dsa.pilas;

import java.util.Arrays;

public class PilaEstatica {
  private Object[] info;
  private int tope;
  
  public PilaEstatica(int tamanio) {
    this.info = new Object[tamanio];
    tope = -1;
  }

  public boolean vacia(){
    return tope == -1;
  }

  public void push(Object obj){
    if(tope >= this.info.length - 1)
      throw new NoMoreElements("No cabe pa");
    tope++;
    info[tope] = obj;
  }

  public Object pop(){
    if(tope < 0)
      throw new NoMoreElements("Hasta aqui llego pa");
    return info[tope--];
  }
  public Object valTope(){
    if(this.vacia()){
      throw new NoMoreElements("Ya esta vacia");
    }
    return info[tope];
  }

  @Override
  public String toString() {
    return Arrays.toString(info);
  } 
}
