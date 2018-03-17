/**
  * @author Yuriy Tumakha
  */
object AtbashCipher {

  private def convert(c: Char) =
    if (c.isDigit) c.toString
    else if (c.isLetter) ('a' + 'z' - c.toLower).toChar.toString
    else ""

  def encode(s: String): String =
    s.foldLeft("")((acc, c) => acc + convert(c)).grouped(5).mkString(" ")

  def decode(s: String): String = s.map(convert).mkString

}
