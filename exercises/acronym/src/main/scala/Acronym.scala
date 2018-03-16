object Acronym {
  def abbreviate(phrase: String): String =
    phrase.split("\\W+").map(_.head.toUpper).mkString
}
