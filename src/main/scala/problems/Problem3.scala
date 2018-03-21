package problems

import scala.annotation.tailrec

object Problem3 {

  @tailrec
  private def _nth[T](n: Int, current: Int, x: List[T]): Option[T] = {
    if (n == current)
      Some(x.head)
    else
      _nth(n, current + 1, x.tail)
  }

  def nth[T](n: Int, x: List[T]): Option[T] = {
    if (x.length <= n)
      None
    else
      _nth(n, 0, x)
  }
}
