package filas;

import com.dsa.pilas.PilaDinamica;

class Fila<T> {
  // TODO: dequeue enqueue vacio y copia/clone 
  // TODO: tarta, doble entrada a,b,c -> a,a,b,b,c,c

  Fila<T>copia(){
    return this.clone();
  }


  void espejo(){
    Fila<T>temp = this.copia();
    PilaDinamica<T> pila = new PilaDinamica();
    while (!this.vacio()){
      T elem = this.dequeue();
      temp.enqueue(elem);
      pila.push(elem);
    }
    while(!temp.vacio()){
      this.enqueue(copia.dequeue());
    }
    while(!pila.vacia()){
      this.enqueue(pila.pop());
    }
  }
}