object StringProcessor {
  def processStrings(strings: List[String], len: Int): List[String] = {
    var result = List[String]()
    result = strings.filter(_.length > len).map(_.toUpperCase)// Цикл for заменен на встроенные высшие функции filter и map, принимающие в себя анонимные функции
    //var result = List[String]()
    //for (str <- strings) {
    //  if (str.length > 3) {
    //    result = result :+ str.toUpperCase
    //  }
    //}
    result
  }

  val moreThan3 = processStrings(_, 3) // Создали каррированную функцию для обработки строк длиннее 3 символов

  def main(args: Array[String]): Unit = {
    val strings = List("apple", "cat", "banana", "dog", "elephant")
    //val processedStrings = processStrings(strings)
    //println(s"Processed strings: $processedStrings")
    //val processedStrings = moreThan3(strings)
    println(s"Processed strings: ${moreThan3(strings).toString}") // Вместо вызова прежней обычной функции вызвали каррированную, которая вызовет обновленную processStrings и сразу же вывели ее результат
  }
}