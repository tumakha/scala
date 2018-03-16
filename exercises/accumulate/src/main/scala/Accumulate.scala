import scala.annotation.tailrec

class Accumulate {

  def accumulate[A, B](f: (A) => B, list: List[A]): List[B] = {
    @tailrec def acc(input: List[A], result: List[B]): List[B] =
      input match {
        case xs :+ x => acc(xs, f(x) :: result)
        case Nil => result
      }

    acc(list, Nil)
  }

}
