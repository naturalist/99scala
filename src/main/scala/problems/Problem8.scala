package problems

object Problem8 {
  def compressRecursive[T](xs: List[T]): List[T] = xs match {
    case Nil => Nil
    case (head :: tail) => head :: compressRecursive(tail.dropWhile(_ == head))
  }

  def compressFunc[T](xs: List[T]): List[T] =
    xs.foldLeft(List[T]()) { 
      (a, b) => if (a.isEmpty || a.last != b) a :+ b 
                else a 
    }

}
