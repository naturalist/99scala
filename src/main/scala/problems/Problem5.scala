package problems

object Problem5 {
  def reverse[T](xs: List[T]): List[T] = xs match {
    case Nil        => Nil
    case (x :: Nil) => x :: Nil
    case (x :: t)   => reverse(t) :+ x
  }
}

