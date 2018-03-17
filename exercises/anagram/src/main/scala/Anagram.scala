/**
  * @author Yuriy Tumakha
  */
object Anagram {

  def anagrams(word: String, anagrams: Seq[String]): Seq[String] = {
    val wLowerCase = word.toLowerCase
    val wSorted = wLowerCase.sorted

    def isAnagram(aLower: String): Boolean = wLowerCase != aLower && wSorted == aLower.sorted

    anagrams.filter(a => isAnagram(a.toLowerCase))
  }

}
