import Allergen.Allergen

/**
  * @author Yuriy Tumakha
  */
object Allergies {

  val allergenList: Set[Allergen] = Allergen.values

  println(allergenList.map(_.name).mkString(", "))

  def allergicTo(allergen: Allergen, score: Int): Boolean = (allergen.id & score) != 0

  def list(score: Int): List[Allergen] = allergenList.filter(allergicTo(_, score)).toList
}

object Allergen extends Enumeration {
  type Allergen = Value

  val Eggs: Allergen = Value(1)
  val Peanuts: Allergen = Value(2)
  val Shellfish: Allergen = Value(4)
  val Strawberries: Allergen = Value(8)
  val Tomatoes: Allergen = Value(16)
  val Chocolate: Allergen = Value(32)
  val Pollen: Allergen = Value(64)
  val Cats: Allergen = Value(128)

  implicit class AllergenWrapper(val allergen: Allergen) {
    def name: String = allergen.toString
  }

}
