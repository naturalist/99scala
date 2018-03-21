package problems

object Problem1 {
  def last[T](x: List[T]): Option[T] = {
    if (x == Nil)
      None
    else
      if (x.tail == Nil) 
        Some(x.head) 
      else 
        last(x.tail)
  }
}
