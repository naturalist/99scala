package problems

object Problem4 {
  def length[T](x: List[T]): Int = x match {
    case Nil => 0
    case (_ :: Nil) => 1
    case _ => 1 + length(x.tail)
  }
}

