object sco01 {

  // :help
  // :he
  // :quit

  // :load <file>
  // :paste -raw
  // kod jest ładowany do obiektu o nazwie takiej jak w nagłówku
  // obiekt jest zapisany pod stałą resn
  // jak uruchomić kod w obiekcie, w funkcji main?

  // w trybie interaktywnym, jeśli komenda zwraca wartość lub sama jest jakąś wartością,
  // to scala zapisuje taką wartość w kolejnej stałej resn
  // po wypisaniu z println jest zajmowana jedna stała, ale jej zawartość jest pusta
  // wypisanie dowolnej stałej resn powoduje zapisanie kolejnej nowej stałej resn
  // stała resn może być użyta w kolejnym wyrażeniu
  // błąd również jest zapisywany do stałej resn (jest to zwrócona wartość)

  // literal - bezpośrednie przedstawienie warości w kodzie

  // value - immutable, typed storage unit
  // val <name>: <type> = <literal>
  // variable - mutable, typed storage unit
  // var <name>: <type> = <literal>

  // tworzenie i przypisanie nie powodują zwrotu i zapisania w resn
  // dopiero wypisana zmienna jest zapisana do resn

  // type - klasyfikacja, definicja; typy są klasami z metodami, które operują na danych

  def main (args: Array[String]): Unit = {
    println("Hello, World!")
    val x: Int = 5
    println(x)
    var a: Double = 3.14
    println(a)
    a = 2 * a * 2.5
    println(a)
  }

}
