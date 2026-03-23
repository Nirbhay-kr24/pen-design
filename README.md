# Pen Design 

### Folder Structure
```
pen-design/
├── .gitignore
├── pom.xml
└── src/
    ├── main/
    │   └── java/
    │       └── com/
    │           └── pen/
    │               ├── Main.java
    │               ├── interfaces/
    │               │   ├── Writable.java
    │               │   ├── RefillPen.java
    │               │   └── InkFillable.java
    │               ├── models/
    │               │   ├── Ink.java
    │               │   ├── InkType.java
    │               │   ├── Nib.java
    │               │   ├── NibType.java
    │               │   ├── PenType.java
    │               │   └── Refill.java
    │               ├── strategies/
    │               │   ├── WritingStrategy.java
    │               │   ├── SmoothWritingStrategy.java
    │               │   ├── RoughWritingStrategy.java
    │               │   └── MarkerWritingStrategy.java
    │               └── pens/
    │                   ├── Pen.java
    │                   ├── refillable/
    │                   │   ├── RefillablePen.java
    │                   │   ├── GelPen.java
    │                   │   ├── BallPen.java
    │                   │   └── ThrowAwayPen.java
    │                   └── nonrefillable/
    │                       ├── NonRefillablePen.java
    │                       ├── FountainPen.java
    │                       └── MarkerPen.java
    └── /
```

# Pen UML Diagram 

```mermaid
classDiagram
    class Writable {
        <<interface>>
        +write()
    }
    class RefillPen {
        <<interface>>
        +changeRefill(refill)
        +canRefill() Boolean
        +getRefill() Refill
    }
    class InkFillable {
        <<interface>>
        +changeInk(ink)
        +getInk() Ink
    }
    class WritingStrategy {
        <<interface>>
        +write()
    }
    class SmoothWritingStrategy {
        +write()
    }
    class RoughWritingStrategy {
        +write()
    }
    class MarkerWritingStrategy {
        +write()
    }
    class Pen {
        <<abstract>>
        -String brand
        -String name
        -PenType type
        -Double price
        -WritingStrategy writingStrategy
        +write()
    }
    class RefillablePen {
        <<abstract>>
        -Refill refill
        +changeRefill(refill)
        +canRefill() Boolean
    }
    class NonRefillablePen {
        <<abstract>>
        -Ink ink
        -Nib nib
        +changeInk(ink)
    }
    class GelPen {
        +canRefill() Boolean
    }
    class BallPen {
        +canRefill() Boolean
    }
    class ThrowAwayPen {
        +canRefill() Boolean
    }
    class FountainPen
    class MarkerPen

    Writable <|.. Pen
    WritingStrategy <|.. SmoothWritingStrategy
    WritingStrategy <|.. RoughWritingStrategy
    WritingStrategy <|.. MarkerWritingStrategy
    Pen <|-- RefillablePen
    Pen <|-- NonRefillablePen
    RefillPen <|.. RefillablePen
    InkFillable <|.. NonRefillablePen
    RefillablePen <|-- GelPen
    RefillablePen <|-- BallPen
    RefillablePen <|-- ThrowAwayPen
    NonRefillablePen <|-- FountainPen
    NonRefillablePen <|-- MarkerPen
    Pen --> WritingStrategy : uses
```
