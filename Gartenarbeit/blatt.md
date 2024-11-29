# Blatt 7

Niels Haupt: 467970

Ughur Alakbarov: 436904

---

# Aufgabe 3
a)
  1.
    Konstruktoren:
      1. `A(int)` -- 100 ist ein `int`
      2. `A(String)` -- "written in A(int)" ist ein `String`
    `print`-Anweisungen:
      1. "v1.x: written in A(int)"
  2.
    Konstuktoren:
      1. `B(int)` -- 100 ist ein `int`
      2. `B(String)` -- "written in B(String)" ist ein `String`
      3. `A(String)` -- "written in B(String)" ist ein `String` und die Oberklasse von `B` ist `A`.
    `print`-Anweisungen:
      1. "v2.x: written in B(String)" -- `v2` hat den Deklarationstyp `A` und `v2.x` greift somit auf `A.x` zu, welches in `A(String)` auf "written in B(String)" gesetzt wurde
      2. Kompilierfehler -- `v2` wurde als `A` deklariert und darf somit nicht zu `B` gecastet werden, da `B` eine Unterklasse von `A` ist
  3.
    Konstuktoren:
      1. `B(A)` -- `v2` hat den Deklarationstyp `A`
      2. `B(String)` -- "written in B(A)" ist ein `String`
      3. `A(String)` -- "written in B(String)" ist ein `String` und die Oberklasse von `B` ist `A`.
    `print`-Anweisungen:
      1. "((A) v3).x: written in B(String)" -- `v3` wird gecastet zu `A`; es wird auf `A.x` zugegriffen, welches in `A(String)` auf "written in B(String)" gesetzt wurde
      2. "v3.x: written in B(A)" -- `v3` hat den Deklarartionstyp `B`; `v3.x` greift auf `B.x` zu, welches in `B(String)` auf "written in B(A)" gesetzt wurde
  4.
    Konstuktoren:
      1. `B()` -- wurde ohne Argumente aufgerufen
      2. `B(String)` -- "written in B()" ist ein `String`
      3. `A(String)` -- "written in B(String)" ist ein `String` und die Oberklasse von `B` ist `A`.
    `print`-Anweisungen:
      1. "((A) v4).x: written in B(String)" -- `v4` wird gecastet zu `A`; es wird auf `A.x` zugegriffen, welches in `A(String)` auf "written in B(String)" gesetzt wurde
      2. "v4.x: written in B()" -- `v4` hat den Deklarartionstyp `B`; `v4.x` greift auf `B.x` zu, welches in `B()` auf "written in B()" gesetzt wurde
b)
  1. `A.f(A)`
  2. `A.f(A)` -- anhand des Deklarationstyps von `v2`
  3. `A.f(A)` -- `v3` wird hochgecastet
  4. `A.f(A)`
  5. `A.f(A)` -- anhand des Deklarationstyps von `v2`
  6. `A.f(A)` -- `v3` wird hochgecastet
  7. `B.f(A)`
  8. `B.f(A)`
  9. `B.f(B)`

## Aufgabe 5

