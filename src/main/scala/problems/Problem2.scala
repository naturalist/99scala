package problems

object Problem2 {
  def penultimate[T](x: List[T]): Option[T] = {
    if (x.length < 2)
      None
    else
      if (x.length == 2)
        Some(x.head)
      else
        penultimate(x.tail)
  }
}
