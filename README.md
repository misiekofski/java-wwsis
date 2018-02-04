Lista zadań 6 (17.12.2017)

#Zadanie 1
Napisz własną implementację generycznego stosu poprzez implementację
interfejsu List (możesz również rozszerzyć klasę AbstractList). ​ Stos może
przechowywać obiekty dowolnego typu. Elementy stosu możesz przechowywać na liście
powiązanej (elementy przechowuj w obiektach klasy StackElement; dostosuj klasę
StackElement z poprzedniej listy zadań, żeby mogła przechowywać obiekty dowolnego
typu), zwykłej tablicy lub w kolekcji Vector.
# Zadanie 2.
Zaimplementuj klasę “Talia”, która umożliwia przechowywanie kart do gry. W
jednej talii kart mogą być maksymalnie 52 karty. Żadna karta nie może się powtarzać.
Kolekcja Talia powinna rozszerzać klasę AbstractCollection.
Przygotuj metodę getOrdered dla Talii, która zwraca listę posortowanych kart według ich
wartości. Zaimplementuj metodę shuffle, która przetasuje karty w kolekcji.
W celu prezentacji programu zasymuluj początkowy fragment rozgrywki w grę karcianą:

* przygotuj kolekcję z pełną talią kart
* przetasuj karty w talii
* “rozdaj” po 5 kart każdemu z 3 graczy
* wyświetl karty każdego kolejnego gracza oraz pozostałe karty w talii

Pamiętaj o wykorzystywaniu typów wyliczeniowych oraz wyjątków, np. w sytuacji, kiedy do
kolekcji kart dodawana jest drugi raz identyczna karta.
