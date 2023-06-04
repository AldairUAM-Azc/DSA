```mermaid
classDiagram
class Comparable{
  compareTo()
}

class Termino {
  - int coeficiente
  - int exponente
}

Comparable <|-- Termino: implements
```