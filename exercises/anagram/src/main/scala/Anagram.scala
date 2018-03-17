/**
  * @author Yuriy Tumakha
  */
object Anagram {

  def anagrams(word: String, anagrams: Seq[String]): Seq[String] = {
    val w = Word(word)
    anagrams.filter(Word(_).isAnagram(w))
  }

}

case class Word(word: String) {
  lazy val lowerCase: String = word.toLowerCase
  lazy val sorted: String = lowerCase.sorted

  def isAnagram(word: Word): Boolean = lowerCase != word.lowerCase && sorted == word.sorted
}
