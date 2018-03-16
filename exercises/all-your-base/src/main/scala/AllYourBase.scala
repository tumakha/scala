import scala.annotation.tailrec

/**
  * @author Yuriy Tumakha
  */
object AllYourBase {

  def rebase(inputBase: Int, inputDigits: List[Int], outputBase: Int): Option[List[Int]] = {

    def toBase10(digits: List[Int]): BigInt =
      digits.foldLeft(BigInt(0))((base10, digit) => base10 * inputBase + digit)

    @tailrec def fromBase10(base10: BigInt, outputDigits: List[Int] = Nil): List[Int] =
      if (base10 == 0 && outputDigits.nonEmpty)
        outputDigits
      else fromBase10(base10 / outputBase, (base10 % outputBase).toInt :: outputDigits)

    if (inputBase > 1 && outputBase > 1 && inputDigits.forall(d => d >= 0 && d < inputBase))
      Some(fromBase10(toBase10(inputDigits)))
    else None
  }

}
