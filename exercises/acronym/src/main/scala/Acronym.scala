object Acronym {
  def abbreviate(phrase: String): String =
    phrase.split("\\W+").flatMap(_.headOption.map(_.toUpper)).mkString
}
